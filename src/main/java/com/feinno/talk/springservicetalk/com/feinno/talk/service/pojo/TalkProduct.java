package com.feinno.talk.springservicetalk.com.feinno.talk.service.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by yushaobo on 18-2-2.
 */
public class TalkProduct {
    /**
     * 段落唯一标识
     * */
    @JSONField(name = "contentID")
    private String contentID;
    /**
     * 当前楼层号（1-6）
     * */
    @JSONField(name = "floorID")
    private String floorID;
    /**
     *数量（２）
     * */
    @JSONField(name = "count")
    private String count;
    /**
     *用户唯一标识
     * */
    @JSONField(name = "userID")
    private String userID;

    /**
     * 用户唯一标识列表（含当前用户）
     * */
    @JSONField(name = "userIDList")
    private String userIDList;

    /**
     * 上一楼段落唯一标识
     * */
    @JSONField(name = "upperContentID")
    private String upperContentID;

    /**
     *主题
     * */
    @JSONField(name = "topic")
    private String topic;

    /**
     *当前文章内容
     * */
    @JSONField(name = "content")
    private String content;
    /**
     *已续接的文章
     * */
    @JSONField(name = "finshContet")
    private String finshContet;
    /**
     *时间戳
     * */
    @JSONField(name = "timestamp")
    private String timestamp;

    public String getContentID() {
        return contentID;
    }

    public void setContentID(String contentID) {
        this.contentID = contentID;
    }

    public String getFloorID() {
        return floorID;
    }

    public void setFloorID(String floorID) {
        this.floorID = floorID;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserIDList() {
        return userIDList;
    }

    public void setUserIDList(String userIDList) {
        this.userIDList = userIDList;
    }

    public String getUpperContentID() {
        return upperContentID;
    }

    public void setUpperContentID(String upperContentID) {
        this.upperContentID = upperContentID;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFinshContet() {
        return finshContet;
    }

    public void setFinshContet(String finshContet) {
        this.finshContet = finshContet;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
