package com.kotlin.retrofit.bean;

import java.util.List;

/**
 * Created by dell on 2018/6/21.
 */
public class UserInfoBean {


    /**
     * rechargeCount : 1
     * code : 10000
     * card : [{"id":1,"name":"liubing","card":"1","department":"部门1","job":"职位1","cardPermission":"权限1","phone":"111111","charge":0}]
     * errorMsg : card信息获取成功
     */

    private int rechargeCount;
    private int code;
    private String errorMsg;
    /**
     * id : 1
     * name : liubing
     * card : 1
     * department : 部门1
     * job : 职位1
     * cardPermission : 权限1
     * phone : 111111
     * charge : 0
     */

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
        private int id;
        private String name;
        private String card;
        private String department;
        private String job;
        private String cardPermission;
        private String phone;
        private int charge;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCard() {
            return card;
        }

        public void setCard(String card) {
            this.card = card;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public String getCardPermission() {
            return cardPermission;
        }

        public void setCardPermission(String cardPermission) {
            this.cardPermission = cardPermission;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public int getCharge() {
            return charge;
        }

        public void setCharge(int charge) {
            this.charge = charge;
        }

        @Override
        public String toString() {
            return "CardBean{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", card='" + card + '\'' +
                    ", department='" + department + '\'' +
                    ", job='" + job + '\'' +
                    ", cardPermission='" + cardPermission + '\'' +
                    ", phone='" + phone + '\'' +
                    ", charge=" + charge +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "UserInfoBean{" +
                "rechargeCount=" + rechargeCount +
                ", code=" + code +
                ", errorMsg='" + errorMsg + '\'' +
                ", card=" + card +
                '}';
    }
}
