package com.kotlin.retrofit.bean;

import java.util.List;

/**
 * Created by dell on 2018/6/19.
 */
public class LoginResponse {


    /**
     * code : 10000
     * user : [{"id":2,"username":"liubing","password":"4280d89a5a03f812751f504cc10ee8a5","sex":"男","department":"保安部","userType":"app","job":"保安","realname":"刘冰","phone":"13366851236","createdAt":"2018-11-20 16:07:00","updatedAt":"2018-12-15 12:48:29","cardId":1}]
     * card : [{"id":1,"name":"liubing","card":"1","department":"部门","job":"职位","cardPermission":"权限","phone":"13344445555","charge":0}]
     * errorMsg : 用户登录成功
     */

    private int code;
    private String errorMsg;
    private List<UserBean> user;
    private List<CardBean> card;

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

    public List<UserBean> getUser() {
        return user;
    }

    public void setUser(List<UserBean> user) {
        this.user = user;
    }

    public List<CardBean> getCard() {
        return card;
    }

    public void setCard(List<CardBean> card) {
        this.card = card;
    }

    public static class UserBean {
        /**
         * id : 2
         * username : liubing
         * password : 4280d89a5a03f812751f504cc10ee8a5
         * sex : 男
         * department : 保安部
         * userType : app
         * job : 保安
         * realname : 刘冰
         * phone : 13366851236
         * createdAt : 2018-11-20 16:07:00
         * updatedAt : 2018-12-15 12:48:29
         * cardId : 1
         */

        private int id;
        private String username;
        private String password;
        private String sex;
        private String department;
        private String userType;
        private String job;
        private String realname;
        private String phone;
        private String createdAt;
        private String updatedAt;
        private int cardId;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getUserType() {
            return userType;
        }

        public void setUserType(String userType) {
            this.userType = userType;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public String getRealname() {
            return realname;
        }

        public void setRealname(String realname) {
            this.realname = realname;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public int getCardId() {
            return cardId;
        }

        public void setCardId(int cardId) {
            this.cardId = cardId;
        }
    }

    public static class CardBean {
        /**
         * id : 1
         * name : liubing
         * card : 1
         * department : 部门
         * job : 职位
         * cardPermission : 权限
         * phone : 13344445555
         * charge : 0.0
         */

        private int id;
        private String name;
        private String card;
        private String department;
        private String job;
        private String cardPermission;
        private String phone;
        private double charge;

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

        public double getCharge() {
            return charge;
        }

        public void setCharge(double charge) {
            this.charge = charge;
        }
    }
}
