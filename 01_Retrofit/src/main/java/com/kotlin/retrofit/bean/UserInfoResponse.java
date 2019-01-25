package com.kotlin.retrofit.bean;

import java.util.List;

/**
 * Copyright
 * <p>
 * Created by xuyang on 2018/12/15 12:32
 * <p>
 * email xuyangme@126.com
 * <p>
 * ${FILENAME}
 * <p>
 * Description
 * <p>
 * Update records:
 */
public class UserInfoResponse {


    /**
     * code : 10000
     * user : [{"id":2,"username":"liubing","password":"4280d89a5a03f812751f504cc10ee8a5","sex":"男","department":"保安部","userType":"app","job":"保安","realname":"刘冰1","phone":"13366851236","createdAt":"2018-11-21 09:18:00","updatedAt":"2018-11-22 21:41:00","cardId":0}]
     * errorMsg : 用户信息获取成功
     */

    private int code;
    private String errorMsg;
    private List<UserBean> user;

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

    public static class UserBean {
        /**
         * id : 2
         * username : liubing
         * password : 4280d89a5a03f812751f504cc10ee8a5
         * sex : 男
         * department : 保安部
         * userType : app
         * job : 保安
         * realname : 刘冰1
         * phone : 13366851236
         * createdAt : 2018-11-21 09:18:00
         * updatedAt : 2018-11-22 21:41:00
         * cardId : 0
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
}
