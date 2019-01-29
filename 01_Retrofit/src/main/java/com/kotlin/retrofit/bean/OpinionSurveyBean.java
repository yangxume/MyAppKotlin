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
public class OpinionSurveyBean {


    /**
     * total : 13
     * code : 10000
     * pages : 5
     * papers : [{"createdAt":"2019-01-21 14:14:00","paper":"问卷调查10","answerPersonNum":"0","id":"29"},{"createdAt":"2019-01-21 14:13:00","paper":"问卷调查3","answerPersonNum":"0","id":"22"},{"createdAt":"2019-01-21 14:13:00","paper":"问卷调查4","answerPersonNum":"0","id":"23"}]
     * errorMsg : 需要答题的列表获取成功
     */

    private int total;
    private int code;
    private int pages;
    private String errorMsg;
    private List<PapersBean> papers;

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

    public List<PapersBean> getPapers() {
        return papers;
    }

    public void setPapers(List<PapersBean> papers) {
        this.papers = papers;
    }

    public static class PapersBean {
        /**
         * createdAt : 2019-01-21 14:14:00
         * paper : 问卷调查10
         * answerPersonNum : 0
         * id : 29
         */

        private String createdAt;
        private String paper;
        private String answerPersonNum;
        private String id;

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getPaper() {
            return paper;
        }

        public void setPaper(String paper) {
            this.paper = paper;
        }

        public String getAnswerPersonNum() {
            return answerPersonNum;
        }

        public void setAnswerPersonNum(String answerPersonNum) {
            this.answerPersonNum = answerPersonNum;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
