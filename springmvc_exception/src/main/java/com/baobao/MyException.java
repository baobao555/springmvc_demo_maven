package com.baobao;

/**
 * @author baobao
 * @create 2019-11-28 21:11
 * @description
 */
public class MyException extends Exception {
    private String message;

    public MyException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
