package com.kotlin.retrofit.bean;

import java.util.List;

/**
 * Copyright
 * <p>
 * Created by xuyang on 2019/1/26 13:56
 * <p>
 * email xuyangme@126.com
 * <p>
 * ${FILENAME}
 * <p>
 * Description
 * <p>
 * Update records:
 */
public class ElectricMonthDataBean {


    /**
     * code : 10000
     * subItemData : [{"num":12830,"type":"备用"},{"num":6418,"type":"动力用电"},{"num":6842,"type":"空调用电"},{"num":10586,"type":"瞬时功率"},{"num":8196,"type":"特殊用电"},{"num":7000,"type":"照明插座用电"}]
     * errorMsg : 运营楼宇点击月份分项用电展示信息成功
     */

    private int code;
    private String errorMsg;
    private List<SubItemDataBean> subItemData;

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

    public List<SubItemDataBean> getSubItemData() {
        return subItemData;
    }

    public void setSubItemData(List<SubItemDataBean> subItemData) {
        this.subItemData = subItemData;
    }

    public static class SubItemDataBean {
        /**
         * num : 12830
         * type : 备用
         */

        private int num;
        private String type;

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
