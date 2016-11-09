package com.lzh.record.common.exception;

/**
 * Created by Administrator on 2016/11/9.
 */
public class BusinessException extends RuntimeException {
    private int  code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
