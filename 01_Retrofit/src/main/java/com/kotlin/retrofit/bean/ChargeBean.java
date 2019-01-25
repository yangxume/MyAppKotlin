package com.kotlin.retrofit.bean;

/**
 * Created by dell on 2018/6/25.
 */
public class ChargeBean {


    /**
     * code : 10030
     * errorMsg : 用户暂未绑定卡号
     * result : {"count":0,"card":{"id":null,"name":null,"card":null,"department":null,"job":null,"cardPermission":null,"phone":null,"charge":0}}
     */

    private int code;
    private String errorMsg;
    /**
     * count : 0
     * card : {"id":null,"name":null,"card":null,"department":null,"job":null,"cardPermission":null,"phone":null,"charge":0}
     */

    private ResultBean result;

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

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private int count;
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

        private CardBean card;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public CardBean getCard() {
            return card;
        }

        public void setCard(CardBean card) {
            this.card = card;
        }

        public static class CardBean {
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

            @Override
            public String toString() {
                return "CardBean{" +
                        "id=" + id +
                        ", name=" + name +
                        ", card=" + card +
                        ", department=" + department +
                        ", job=" + job +
                        ", cardPermission=" + cardPermission +
                        ", phone=" + phone +
                        ", charge=" + charge +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "ResultBean{" +
                    "count=" + count +
                    ", card=" + card +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ChargeBean{" +
                "code=" + code +
                ", errorMsg='" + errorMsg + '\'' +
                ", result=" + result +
                '}';
    }
}
