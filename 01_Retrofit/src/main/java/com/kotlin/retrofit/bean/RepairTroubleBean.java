package com.kotlin.retrofit.bean;

/**
 * Copyright
 * <p>
 * Created by xuyang on 2019/1/26 14:16
 * <p>
 * email xuyangme@126.com
 * <p>
 * ${FILENAME}
 * <p>
 * Description
 * <p>
 * Update records:
 */
public class RepairTroubleBean {


    /**
     * code : 10000
     * errorMsg : 故障报修提交---成功
     */

    private int code;
    private String errorMsg;

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
}
