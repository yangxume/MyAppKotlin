package com.kotlin.retrofit.bean;

import java.util.List;

/**
 * Copyright
 * <p>
 * Created by xuyang on 2018/12/15 12:29
 * <p>
 * email xuyangme@126.com
 * <p>
 * ${FILENAME}
 * <p>
 * Description
 * <p>
 * Update records:
 */
public class CardInfoResponse {


    /**
     * rechargeCount : 0
     * code : 10030
     * card : [{"id":null,"name":null,"card":null,"department":null,"job":null,"cardPermission":null,"phone":null,"charge":0}]
     * errorMsg : 用户暂未绑定卡号
     */

    private int rechargeCount;
    private int code;
    private String errorMsg;
    private List<CardBean> card;

    public int getRechargeCount() {
        return rechargeCount;
    }

    public void setRechargeCount(int rechargeCount) {
        this.rechargeCount = rechargeCount;
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

    public List<CardBean> getCard() {
        return card;
    }

    public void setCard(List<CardBean> card) {
        this.card = card;
    }

    public static class CardBean {
        /**
         * id : null
         * name : null
         * card : null
         * department : null
         * job : null
         * cardPermission : null
         * phone : null
         * charge : 0
         */

        private Object id;
        private Object name;
        private Object card;
        private Object department;
        private Object job;
        private Object cardPermission;
        private Object phone;
        private int charge;

        public Object getId() {
            return id;
        }

        public void setId(Object id) {
            this.id = id;
        }

        public Object getName() {
            return name;
        }

        public void setName(Object name) {
            this.name = name;
        }

        public Object getCard() {
            return card;
        }

        public void setCard(Object card) {
            this.card = card;
        }

        public Object getDepartment() {
            return department;
        }

        public void setDepartment(Object department) {
            this.department = department;
        }

        public Object getJob() {
            return job;
        }

        public void setJob(Object job) {
            this.job = job;
        }

        public Object getCardPermission() {
            return cardPermission;
        }

        public void setCardPermission(Object cardPermission) {
            this.cardPermission = cardPermission;
        }

        public Object getPhone() {
            return phone;
        }

        public void setPhone(Object phone) {
            this.phone = phone;
        }

        public int getCharge() {
            return charge;
        }

        public void setCharge(int charge) {
            this.charge = charge;
        }
    }
}
