package com.example.swap_data.common;

import java.util.HashMap;
import java.util.Map;

public class BaseMessage {


    /**
     * 错误码
     */
    private Integer errcode;

    /**
     * 错误信息
     */
    private String errmsg = "";

    /**
     * data信息
     */
    private Map<String, Object> data = new HashMap<String, Object>();

    /**
     * new
     * @return
     */
    public static BaseMessage newInstance() {
        return new BaseMessage();
    }

    /**
     * 成功
     * @return
     */
    public BaseMessage success() {
        this.errcode = 200;
        return this;
    }

    /**
     * 失败
     * @param code
     * @return
     */
    public BaseMessage error(Integer code) {
        this.errcode = code;
        return this;
    }

    /**
     * 失败
     * @return
     */
    public BaseMessage error() {
        this.errcode = 1;
        return this;
    }

    /**
     * set code
     * @param code
     * @return
     */
    public BaseMessage code(Integer code) {
        this.errcode = code;
        return this;
    }

    /**
     * set msg
     * @param msg
     * @return
     */
    public BaseMessage msg(String msg) {
        this.errmsg = msg;
        return this;
    }

    /**
     * 增加返回数据
     * @param key
     * @param
     * @return
     */
    public BaseMessage addData(String key, Object object) {
        this.data.put(key, object);
        return this;
    }

    private BaseMessage() {
    }

    public BaseMessage(Integer code, String msg) {
        this.errcode = code;
        this.errmsg = msg;
    }

    public BaseMessage(String code, String msg) {
        this.errcode = Integer.parseInt(code);
        this.errmsg = msg;
    }

    /**
     * @return the errcode
     */
    public Integer getErrcode() {
        return errcode;
    }

    /**
     * @param errcode the errcode to set
     */
    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    /**
     * @return the errmsg
     */
    public String getErrmsg() {
        return errmsg;
    }

    /**
     * @param errmsg the errmsg to set
     */
    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    /**
     * @return the data
     */
    public Map<String, Object> getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
