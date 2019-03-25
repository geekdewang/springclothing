package com.zdwsh.springclothing.vo;

import java.io.Serializable;

/**
 *@Author feri
 *@Date Created in 2019/2/19 10:24
 */
public class ResultVo implements Serializable {
    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private Object data;

}
