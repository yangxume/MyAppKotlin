package com.kotlin.retrofit.bean;

import java.util.List;

/**
 * Copyright
 * <p>
 * Created by xuyang on 2019/1/26 14:38
 * <p>
 * email xuyangme@126.com
 * <p>
 * ${FILENAME}
 * <p>
 * Description
 * <p>
 * Update records:
 */
public class AuditeInfoDetailBean {


    /**
     * code : 10000
     * unchecked : [{"name":"通知4","information":"呜呜4","department":"人事部","startDate":"2018-12-12","realname":"jj2"}]
     * errorMsg : 信息详情展示成功
     */

    private int code;
    private String errorMsg;
    private List<UncheckedBean> unchecked;

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

    public List<UncheckedBean> getUnchecked() {
        return unchecked;
    }

    public void setUnchecked(List<UncheckedBean> unchecked) {
        this.unchecked = unchecked;
    }

    public static class UncheckedBean {
        /**
         * name : 通知4
         * information : 呜呜4
         * department : 人事部
         * startDate : 2018-12-12
         * realname : jj2
         */

        private String name;
        private String information;
        private String department;
        private String startDate;
        private String realname;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getInformation() {
            return information;
        }

        public void setInformation(String information) {
            this.information = information;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public String getRealname() {
            return realname;
        }

        public void setRealname(String realname) {
            this.realname = realname;
        }
    }
}
