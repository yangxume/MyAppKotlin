package com.kotlin.retrofit.bean;

import java.util.List;

/**
 * Copyright
 * <p>
 * Created by xuyang on 2019/1/26 14:17
 * <p>
 * email xuyangme@126.com
 * <p>
 * ${FILENAME}
 * <p>
 * Description
 * <p>
 * Update records:
 */
public class RepairTrackingBean {


    /**
     * code : 10000
     * result : [{"time":"2019-01-09 09:55:01","type":"灯坏了","statue":"0","information":"A区333办公室灯不亮","repairId":"6"},{"time":"2019-01-09 09:42:25","type":"灯坏了","statue":"0","information":"A区333办公室灯不亮","repairId":"5"},{"time":"2019-01-07 17:22:06","type":"Est","statue":"0","information":"test","repairId":"4"},{"time":"2019-01-04 18:50:56","type":"A101灯不亮","statue":"1","information":"灯不亮，等不了","repairId":"3"},{"time":"2019-01-04 18:44:09","type":"A101灯不亮","statue":"0","information":"灯不亮，等不了","repairId":"2"},{"time":"2019-01-04 17:56:46","type":"A101灯不亮","statue":"0","information":"灯不亮，等不了","repairId":"1"}]
     * errorMsg : 物业人员报修跟踪信息获取成功
     * pages : 1
     * total : 6
     * department : 0
     */

    private int code;
    private String errorMsg;
    private int pages;
    private int total;
    private String department;
    private List<ResultBean> result;

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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * time : 2019-01-09 09:55:01
         * type : 灯坏了
         * statue : 0
         * information : A区333办公室灯不亮
         * repairId : 6
         */

        private String time;
        private String type;
        private String statue;
        private String information;
        private String repairId;

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getStatue() {
            return statue;
        }

        public void setStatue(String statue) {
            this.statue = statue;
        }

        public String getInformation() {
            return information;
        }

        public void setInformation(String information) {
            this.information = information;
        }

        public String getRepairId() {
            return repairId;
        }

        public void setRepairId(String repairId) {
            this.repairId = repairId;
        }
    }
}
