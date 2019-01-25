package com.kotlin.retrofit.basic_use.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.util.Log;

import com.kotlin.retrofit.MyApplication;
import com.kotlin.retrofit.net.LoggingInterceptor;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.CipherSuite;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.TlsVersion;
import okio.Buffer;
import okio.BufferedSource;


/**
 * Created by Administrator on 2016/12/22.
 */
public class OkHttpUtil {
    private static final String TAG = "OkHttpUtil";
    //设置缓存目录
    private static File cacheDirectory = new File(getDiskCacheDir(MyApplication.getInstance().getApplicationContext()), "cacherespones");
    private static Cache cache = new Cache(cacheDirectory, 10 * 1024 * 1024);
    //包含header、body数据
    private static HashMap<String, List<Cookie>> cookieStore = new HashMap<String, List<Cookie>>();


    public static OkHttpClient getOkHttpClient() {
        return MyOkHttpUtil.okHttpClient;
    }

    private static class MyOkHttpUtil {

        static OkHttpClient okHttpClient = new OkHttpClient.Builder()
//                .hostnameVerifier(new HostnameVerifier() {
//                    @Override
//                    public boolean verify(String hostname, SSLSession session) {
//                        return true;
//                    }
//                })
//                .sslSocketFactory(sslParams.sSLSocketFactory,sslParams.trustManager)
//                .connectionSpecs(Collections.singletonList(getConnectionSpec()))
                 .addInterceptor(cacheInterceptor)
                 .addInterceptor(new LoggingInterceptor())
//                 .addInterceptor(sessionInterceptor)
//                .addInterceptor(idInterceptor)
                .cookieJar(new CookieJar() {
                    @Override
                    public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
                        cookieStore.put(url.host(), cookies);
                    }

                    @Override
                    public List<Cookie> loadForRequest(HttpUrl url) {
                        List<Cookie> cookies = cookieStore.get(url.host());
                        return cookies != null ? cookies : new ArrayList<Cookie>();
                    }
                })
             .cache(cache)
             .build();
    }


    /**
     * request 没网从本地缓存中读取
     * Response，网络好，设置失效时间为0（即不失效），网络未连接设置缓存时间为1周
     */
    private static Interceptor cacheInterceptor = new Interceptor() {
        @Override
        public Response intercept(Chain chain) throws IOException {

            Request request = chain.request();//设置是否访问网络
            if (!isNetAvailable()) {
                request = request.newBuilder()
                        .cacheControl(CacheControl.FORCE_CACHE)
                        .build();
                Log.i("===net work====", "network unAvailable,so force request cache...");
            } else {
                request = request.newBuilder()
                        .cacheControl(CacheControl.FORCE_NETWORK)
                        .build();
                Log.i("===net work====", "network Available,so force request network...");
            }

            Response response = chain.proceed(request);//设置是否缓存
            if (isNetAvailable()) {
                int maxAge = 0 * 60; // 有网络时 设置缓存超时时间0个小时
                return response.newBuilder()
                        .header("Cache-Control", "public, max-age=" + maxAge)
                        .removeHeader("Pragma")// 清除头信息，因为服务器如果不支持，会返回一些干扰信息，不清除下面无法生效
                        .build();
            } else {
                Log.i("====net work====", "network error,set cache 1 week...");
                int maxStale = 60 * 60 * 24 * 7; // 无网络时，设置超时为1周
                return response.newBuilder()
                        .header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)
                        .removeHeader("Pragma")
                        .build();
            }
        }
    };

    private static boolean isNetAvailable() {
        ConnectivityManager cm = (ConnectivityManager) MyApplication.getInstance().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo current = cm.getActiveNetworkInfo();
        if (current == null) {
            return false;
        }
        return current.isAvailable();
    }

    public static File getCacheDirectory() {
        return cacheDirectory;
    }
    public  static  String getDiskCacheDir(Context context) {
        String cachePath = null;
         //Environment.getExtemalStorageState() 获取SDcard的状态
         //Environment.MEDIA_MOUNTED 手机装有SDCard,并且可以进行读写
        if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())
                || !Environment.isExternalStorageRemovable()) {
            cachePath = context.getExternalCacheDir().getAbsolutePath();
        } else {
            cachePath = context.getCacheDir().getPath();
        }
        return cachePath;
    }

    static Interceptor idInterceptor = new Interceptor() {
        @Override
        public Response intercept(Chain chain) throws IOException {

            Request.Builder builder = chain.request()
                    .newBuilder();

//            builder.addHeader("content-type", "application/json")
//                    .addHeader("Referer", "wuzi19");
//            if (Constant.FLAG_LOGIN) {
////                builder.addHeader("phoneNum", phone_num)
//                builder.addHeader("phoneNum", AES.encryptHexString(phone_num))
//                        .addHeader("code", DevicesIdUtil.getDeviceId());
//            }
            Request request = builder.build();

            return chain.proceed(request);
        }
    };


    //判断是否会话超时
    private static Interceptor sessionInterceptor = new Interceptor() {

        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            Buffer sink = new Buffer();
            request.body().writeTo(sink);
            Response responseBody = chain.proceed(request);
            BufferedSource source = responseBody.body().source();

            source.request(Long.MAX_VALUE); // Buffer the entire body.
            Buffer buffer = source.buffer();
            String bodyString = buffer.clone().readString(Charset.defaultCharset());
//            if (bodyString.contains(Constant.LOGIN_OHTHER)) {
//                ToastUtils.showToast("账号已在其他设备登录，请重新登录");
//                MyApplication.getInstance().finishAllActivity();
//                MyApplication.getInstance().startActivity(new Intent(MyApplication.getInstance().getApplicationContext(), WelcomeActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
//                responseBody.body().string();
//            } else if (bodyString.contains(Constant.SESSION_TIMEOUT)) {
//                ToastUtils.showToast("会话超时，请重新登录");
//                MyApplication.getInstance().finishAllActivity();
//                MyApplication.getInstance().startActivity(new Intent(MyApplication.getInstance().getApplicationContext(), WelcomeActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
////                ToActivityUtil.startActivityIntentSafe(MyApplication.getInstance(),new Intent("android.intent.action.logins").addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
//                responseBody.body().string();
//            }
//            Log.e(TAG, "请求返回数据: " + bodyString);

            return responseBody;
        }
    };

    private static ConnectionSpec getConnectionSpec() {
        ConnectionSpec spec = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_0).cipherSuites(CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA).build();
        return spec;
    }

    private  static void injectParamsIntoUrl(Request request, Request.Builder requestBuilder, Map<String, String> paramsMap) {
        HttpUrl.Builder httpUrlBuilder = request.url().newBuilder();
        if (paramsMap.size() > 0) {
            Iterator iterator = paramsMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry) iterator.next();
                httpUrlBuilder.addQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }

        requestBuilder.url(httpUrlBuilder.build());
    }

    private static String bodyToString(final RequestBody request){
        try {
            final RequestBody copy = request;
            final Buffer buffer = new Buffer();
            if(copy != null)
                copy.writeTo(buffer);
            else
                return "";
            return buffer.readUtf8();
        }
        catch (final IOException e) {
            return "did not work";
        }
    }
}
