package com.kotlin.retrofit.bean;

/**
 * Created by dell on 2018/6/21.
 */
public class LogoutBean {

    /**
     * code : 10000
     * errorMsg : 用户退出成功
     * result :
     */

    private int code;
    private String errorMsg;
    private String result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
