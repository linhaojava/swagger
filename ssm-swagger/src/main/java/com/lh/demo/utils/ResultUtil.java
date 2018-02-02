package com.lh.demo.utils;

import com.wordnik.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class ResultUtil implements Serializable {
    private static final long serialVersionUID = 2678057433315055586L;
    @ApiModelProperty(value = "状态")
    private int status;// 状态
    @ApiModelProperty(value = "消息")
    private String msg;// 消息
    @ApiModelProperty(value = "数据")
    private Object data;// 数据

    public int getStatus() {
        return status;
    }

    public ResultUtil setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResultUtil setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getData() {
        return data;
    }

    public ResultUtil setData(Object data) {
        this.data = data;
        return this;
    }


    public ResultUtil(int status, String msg, Object data) {
        super();
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public ResultUtil() {
        super();
        // TODO Auto-generated constructor stub
    }

}
