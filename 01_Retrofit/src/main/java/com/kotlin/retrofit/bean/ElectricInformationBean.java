package com.kotlin.retrofit.bean;

import java.util.List;

/**
 * Copyright
 * <p>
 * Created by xuyang on 2018/12/15 13:06
 * <p>
 * email xuyangme@126.com
 * <p>
 * ${FILENAME}
 * <p>
 * Description
 * <p>
 * Update records:
 */
public class ElectricInformationBean {


    /**
     * code : 10000
     * MonthData : [{"month":"1月","data":11446},{"month":"2月","data":7128},{"month":"3月","data":22057},{"month":"4月","data":16141},{"month":"5月","data":12424},{"month":"6月","data":13552},{"month":"7月","data":12689},{"month":"8月","data":11482},{"month":"9月","data":15892},{"month":"10月","data":11608},{"month":"11月","data":51872}]
     * subItemData : [{"num":12830,"type":"备用"},{"num":6418,"type":"动力用电"},{"num":6842,"type":"空调用电"},{"num":10586,"type":"瞬时功率"},{"num":8196,"type":"特殊用电"},{"num":7000,"type":"照明插座用电"}]
     * errorMsg : 运营楼宇首页展示信息成功
     */

    private int code;
    private String errorMsg;
    private List<MonthDataBean> MonthData;
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

    public List<MonthDataBean> getMonthData() {
        return MonthData;
    }

    public void setMonthData(List<MonthDataBean> MonthData) {
        this.MonthData = MonthData;
    }

    public List<SubItemDataBean> getSubItemData() {
        return subItemData;
    }

    public void setSubItemData(List<SubItemDataBean> subItemData) {
        this.subItemData = subItemData;
    }

    public static class MonthDataBean {
        /**
         * month : 1月
         * data : 11446
         */

        private String month;
        private int data;

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
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
