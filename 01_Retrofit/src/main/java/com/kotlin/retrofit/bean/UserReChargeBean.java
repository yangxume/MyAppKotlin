package com.kotlin.retrofit.bean;

import java.util.List;

/**
 * Created by dell on 2018/6/25.
 */
public class UserReChargeBean {


    /**
     * total : 2
     * code : 10000
     * pages : 1
     * errorMsg : recharge信息获取成功
     * num : 2
     * recharges : [{"id":1,"base_PerID":"01","base_CardNo":"0001","base_Money":"100","base_Remain":"50","base_ChaType":"0","base_IsSub":"0","base_DateTime":"2018-12-26 11:11:11"}]
     */

    private int total;
    private int code;
    private int pages;
    private String errorMsg;
    private int num;
    private List<RechargesBean> recharges;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<RechargesBean> getRecharges() {
        return recharges;
    }

    public void setRecharges(List<RechargesBean> recharges) {
        this.recharges = recharges;
    }

    public static class RechargesBean {
        /**
         * id : 1
         * base_PerID : 01
         * base_CardNo : 0001
         * base_Money : 100
         * base_Remain : 50
         * base_ChaType : 0
         * base_IsSub : 0
         * base_DateTime : 2018-12-26 11:11:11
         */

        private int id;
        private String base_PerID;
        private String base_CardNo;
        private String base_Money;
        private String base_Remain;
        private String base_ChaType;
        private String base_IsSub;
        private String base_DateTime;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getBase_PerID() {
            return base_PerID;
        }

        public void setBase_PerID(String base_PerID) {
            this.base_PerID = base_PerID;
        }

        public String getBase_CardNo() {
            return base_CardNo;
        }

        public void setBase_CardNo(String base_CardNo) {
            this.base_CardNo = base_CardNo;
        }

        public String getBase_Money() {
            return base_Money;
        }

        public void setBase_Money(String base_Money) {
            this.base_Money = base_Money;
        }

        public String getBase_Remain() {
            return base_Remain;
        }

        public void setBase_Remain(String base_Remain) {
            this.base_Remain = base_Remain;
        }

        public String getBase_ChaType() {
            return base_ChaType;
        }

        public void setBase_ChaType(String base_ChaType) {
            this.base_ChaType = base_ChaType;
        }

        public String getBase_IsSub() {
            return base_IsSub;
        }

        public void setBase_IsSub(String base_IsSub) {
            this.base_IsSub = base_IsSub;
        }

        public String getBase_DateTime() {
            return base_DateTime;
        }

        public void setBase_DateTime(String base_DateTime) {
            this.base_DateTime = base_DateTime;
        }
    }
}
