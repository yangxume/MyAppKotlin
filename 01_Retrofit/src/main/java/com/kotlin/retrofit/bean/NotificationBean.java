package com.kotlin.retrofit.bean;

import java.util.List;

/**
 * Copyright
 * <p>
 * Created by xuyang on 2019/1/22 21:57
 * <p>
 * email xuyangme@126.com
 * <p>
 * ${FILENAME}
 * <p>
 * Description
 * <p>
 * Update records:
 */
public class NotificationBean {


    /**
     * total : 23
     * code : 10000
     * pages : 2
     * listNotification : [{"id":25,"type":"调查问卷","information":"测试","time":"2019-01-21 21:49:35","logistics":0,"typeId":30},{"id":24,"type":"下发通知","information":"没得吃了吧！！！！","time":"2019-01-21 21:32","logistics":0,"typeId":26},{"id":23,"type":"调查问卷","information":"问卷调查9","time":"2019-01-21 14:18:19","logistics":0,"typeId":28},{"id":22,"type":"调查问卷","information":"问卷调查8","time":"2019-01-21 14:18:14","logistics":0,"typeId":27},{"id":21,"type":"调查问卷","information":"问卷调查7","time":"2019-01-21 14:18:09","logistics":0,"typeId":26},{"id":20,"type":"调查问卷","information":"问卷调查6","time":"2019-01-21 14:18:04","logistics":0,"typeId":25},{"id":19,"type":"调查问卷","information":"问卷调查5","time":"2019-01-21 14:18:00","logistics":0,"typeId":24},{"id":18,"type":"调查问卷","information":"问卷调查4","time":"2019-01-21 14:17:56","logistics":0,"typeId":23},{"id":17,"type":"调查问卷","information":"问卷调查3","time":"2019-01-21 14:17:51","logistics":0,"typeId":22},{"id":16,"type":"调查问卷","information":"问卷调查10","time":"2019-01-21 14:17:43","logistics":0,"typeId":29},{"id":15,"type":"下发通知","information":"呜呜4","time":"2019-01-19 15:43","logistics":0,"typeId":29},{"id":14,"type":"下发通知","information":"测试下发通知","time":"2019-01-19 15:41","logistics":0,"typeId":27},{"id":13,"type":"下发通知","information":"呜呜3","time":"2019-01-19 15:26","logistics":0,"typeId":28},{"id":12,"type":"下发通知","information":"呜呜2","time":"2019-01-19 15:23","logistics":0,"typeId":27},{"id":11,"type":"下发通知","information":"没得吃了吧！！！！","time":"2019-01-16 16:50","logistics":0,"typeId":26},{"id":9,"type":"调查问卷","information":"问卷调查2","time":"2019-01-16 03:10:19","logistics":0,"typeId":21},{"id":10,"type":"调查问卷","information":"问卷调查2","time":"2019-01-16 03:10:19","logistics":0,"typeId":21},{"id":8,"type":"设备故障","information":"位置：A312详情：有个灯管不亮","time":"2019-01-15 10:58:58","logistics":1,"typeId":11},{"id":7,"type":"设备故障","information":"位置：Bbbbbb详情：rrerrrr","time":"2019-01-15 10:10:36","logistics":1,"typeId":10},{"id":6,"type":"设备故障","information":"位置：Gggggggggggggg详情：hhhhhhh","time":"2019-01-15 10:07:50","logistics":1,"typeId":9}]
     * errorMsg : 所有通知信息获取成功
     */

    private int total;
    private int code;
    private int pages;
    private String errorMsg;
    private List<ListNotificationBean> listNotification;

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

    public List<ListNotificationBean> getListNotification() {
        return listNotification;
    }

    public void setListNotification(List<ListNotificationBean> listNotification) {
        this.listNotification = listNotification;
    }

    public static class ListNotificationBean {
        /**
         * id : 25
         * type : 调查问卷
         * information : 测试
         * time : 2019-01-21 21:49:35
         * logistics : 0
         * typeId : 30
         */

        private int id;
        private String type;
        private String information;
        private String time;
        private int logistics;
        private int typeId;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getInformation() {
            return information;
        }

        public void setInformation(String information) {
            this.information = information;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public int getLogistics() {
            return logistics;
        }

        public void setLogistics(int logistics) {
            this.logistics = logistics;
        }

        public int getTypeId() {
            return typeId;
        }

        public void setTypeId(int typeId) {
            this.typeId = typeId;
        }
    }


}
