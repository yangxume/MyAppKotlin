package com.kotlin.retrofit.bean;

import java.util.List;

/**
 * Created by dell on 2018/6/25.
 */
public class ConsumptionBean {

    /**
     * code : 10000
     * errorMsg : consume信息获取成功
     * result : {"total":1,"pages":1,"consumes":[{"id":6,"cardId":1,"slotCardTime":"2018-05-19 13:00:00","slotCardPlace":"充值","slotCardType":"充值","charge":40,"card":{"id":1,"name":"liubing","card":"1","department":"部门1","job":"职位1","cardPermission":"权限1","phone":"111111","charge":0}}]}
     */

    private int code;
    private String errorMsg;
    /**
     * total : 1
     * pages : 1
     * consumes : [{"id":6,"cardId":1,"slotCardTime":"2018-05-19 13:00:00","slotCardPlace":"充值","slotCardType":"充值","charge":40,"card":{"id":1,"name":"liubing","card":"1","department":"部门1","job":"职位1","cardPermission":"权限1","phone":"111111","charge":0}}]
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
        private int total;
        private int pages;
        /**
         * id : 6
         * cardId : 1
         * slotCardTime : 2018-05-19 13:00:00
         * slotCardPlace : 充值
         * slotCardType : 充值
         * charge : 40
         * card : {"id":1,"name":"liubing","card":"1","department":"部门1","job":"职位1","cardPermission":"权限1","phone":"111111","charge":0}
         */

        private List<ConsumesBean> consumes;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public List<ConsumesBean> getConsumes() {
            return consumes;
        }

        public void setConsumes(List<ConsumesBean> consumes) {
            this.consumes = consumes;
        }

        public static class ConsumesBean {
            private int id;
            private int cardId;
            private String slotCardTime;
            private String slotCardPlace;
            private String slotCardType;
            private int charge;
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

            private CardBean card;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getCardId() {
                return cardId;
            }

            public void setCardId(int cardId) {
                this.cardId = cardId;
            }

            public String getSlotCardTime() {
                return slotCardTime;
            }

            public void setSlotCardTime(String slotCardTime) {
                this.slotCardTime = slotCardTime;
            }

            public String getSlotCardPlace() {
                return slotCardPlace;
            }

            public void setSlotCardPlace(String slotCardPlace) {
                this.slotCardPlace = slotCardPlace;
            }

            public String getSlotCardType() {
                return slotCardType;
            }

            public void setSlotCardType(String slotCardType) {
                this.slotCardType = slotCardType;
            }

            public int getCharge() {
                return charge;
            }

            public void setCharge(int charge) {
                this.charge = charge;
            }

            public CardBean getCard() {
                return card;
            }

            public void setCard(CardBean card) {
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
            }

            @Override
            public String toString() {
                return "ConsumesBean{" +
                        "id=" + id +
                        ", cardId=" + cardId +
                        ", slotCardTime='" + slotCardTime + '\'' +
                        ", slotCardPlace='" + slotCardPlace + '\'' +
                        ", slotCardType='" + slotCardType + '\'' +
                        ", charge=" + charge +
                        ", card=" + card +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "ResultBean{" +
                    "total=" + total +
                    ", pages=" + pages +
                    ", consumes=" + consumes +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ConsumptionBean{" +
                "code=" + code +
                ", errorMsg='" + errorMsg + '\'' +
                ", result=" + result +
                '}';
    }
}
