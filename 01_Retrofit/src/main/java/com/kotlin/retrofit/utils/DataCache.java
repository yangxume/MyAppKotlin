package com.kotlin.retrofit.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright
 * <p>
 * Created by xuyang on 2019/1/22 21:32
 * <p>
 * email xuyangme@126.com
 * <p>
 * ${FILENAME}
 * <p>
 * Description
 * <p>
 * Update records:
 */
public class DataCache {

    public static DataCache mDataCache;

    private Map<String,String> userMap = new HashMap<>();

    private DataCache(){}

    public static DataCache getInstance(){

        if (mDataCache == null){
            mDataCache = new DataCache();
        }

        return mDataCache;
    }

    public Map<String, String> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, String> userMap) {
        this.userMap = userMap;
    }
}
