package com.kotlin.retrofit.bean;

import java.util.List;

/**
 * Copyright
 * <p>
 * Created by xuyang on 2018/12/15 12:40
 * <p>
 * email xuyangme@126.com
 * <p>
 * ${FILENAME}
 * <p>
 * Description
 * <p>
 * Update records:
 */
public class OpinionSurveyResponse {


    /**
     * code : 10000
     * errorMsg : 需要答题的列表获取成功
     * result : {"total":2,"pages":1,"papers":[{"id":7,"paper":"物业财务试卷","status":4,"createdAt":"2018-06-01 11:49:00"}]}
     */

    private int code;
    private String errorMsg;
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
        /**
         * total : 2
         * pages : 1
         * papers : [{"id":7,"paper":"物业财务试卷","status":4,"createdAt":"2018-06-01 11:49:00"}]
         */

        private int total;
        private int pages;
        private List<PapersBean> papers;

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

        public List<PapersBean> getPapers() {
            return papers;
        }

        public void setPapers(List<PapersBean> papers) {
            this.papers = papers;
        }

        public static class PapersBean {
            /**
             * id : 7
             * paper : 物业财务试卷
             * status : 4
             * createdAt : 2018-06-01 11:49:00
             */

            private int id;
            private String paper;
            private int status;
            private String createdAt;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getPaper() {
                return paper;
            }

            public void setPaper(String paper) {
                this.paper = paper;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }
        }
    }
}
