package com.kotlin.retrofit.bean;

/**
 * Copyright
 * <p>
 * Created by xuyang on 2019/1/26 13:52
 * <p>
 * email xuyangme@126.com
 * <p>
 * ${FILENAME}
 * <p>
 * Description
 * <p>
 * Update records:
 */
public class OpinionSurveyResultBean {


    /**
     * code : 10000
     * errorMsg : 问卷保存成功
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
