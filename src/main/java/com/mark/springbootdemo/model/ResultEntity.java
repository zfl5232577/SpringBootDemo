package com.mark.springbootdemo.model;

import java.io.Serializable;

public class ResultEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDebugMessage() {
        return debugMessage;
    }

    public void setDebugMessage(String debugMessage) {
        this.debugMessage = debugMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private int resultCode;
    private String message;
    private String debugMessage;
    private T data;

    public ResultEntity(T t) {
        data = t;
    }
}
