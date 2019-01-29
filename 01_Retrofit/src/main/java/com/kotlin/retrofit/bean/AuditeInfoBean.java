package com.kotlin.retrofit.bean;

import java.util.List;

/**
 * Copyright
 * <p>
 * Created by xuyang on 2019/1/26 14:37
 * <p>
 * email xuyangme@126.com
 * <p>
 * ${FILENAME}
 * <p>
 * Description
 * <p>
 * Update records:
 */
public class AuditeInfoBean {


    /**
     * result : [{"name":"陕西神木、贵州贵阳排查出非洲猪瘟疫情","id":"29","time":"2018年12月10日 09:00","status":"1"},{"name":"北京政务服务中心不迁入副中心，元旦一窗通办市级事","id":"30","time":"2018年12月09日 08:00","status":"1"},{"name":"标题20","id":"51","time":"2018年12月03日 09:00","status":"2"},{"name":"标题20","id":"52","time":"2018年12月03日 09:00","status":"2"},{"name":"标题19","id":"50","time":"2018年12月03日 08:00","status":"2"}]
     * total : 7
     * code : 10000
     * pages : 2
     * errorMsg : broadcast信息获取成功
     */

    private int total;
    private int code;
    private int pages;
    private String errorMsg;
    private List<ResultBean> result;

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

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * name : 陕西神木、贵州贵阳排查出非洲猪瘟疫情
         * id : 29
         * time : 2018年12月10日 09:00
         * status : 1
         */

        private String name;
        private String id;
        private String time;
        private String status;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
