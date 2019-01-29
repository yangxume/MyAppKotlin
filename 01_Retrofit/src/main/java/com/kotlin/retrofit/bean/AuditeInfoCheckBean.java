package com.kotlin.retrofit.bean;

/**
 * Copyright
 * <p>
 * Created by xuyang on 2019/1/26 14:13
 * <p>
 * email xuyangme@126.com
 * <p>
 * ${FILENAME}
 * <p>
 * Description
 * <p>
 * Update records:
 */
public class AuditeInfoCheckBean {


    /**
     * result : 1
     * code : 10000
     * errorMsg : 审批拒绝状态---成功
     */

    private int result;
    private int code;
    private String errorMsg;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

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
