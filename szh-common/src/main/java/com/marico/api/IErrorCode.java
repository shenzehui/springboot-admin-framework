package com.marico.api;

/**
 * 封装API的错误码
 * Created by marico
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
