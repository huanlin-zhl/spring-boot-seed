package com.zhl.springbootseed.seed.core;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Huanlin-ZHL
 * @date 2020/4/1 19:01
 */
@Getter
@Setter
public class Result<T> {

    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    private int code;

    private String message;

    private T data;

    Result(){
        this.code = ResultCode.SUCCESS.getCode();
        this.message = DEFAULT_SUCCESS_MESSAGE;
    }

    Result(T data){
        this.code = ResultCode.SUCCESS.getCode();
        this.message = DEFAULT_SUCCESS_MESSAGE;
        this.data = data;
    }

    Result(ResultCode resultCode, String message){
        this.code = resultCode.getCode();
        this.message = message;
    }

    public static Result successResult(){
        return new Result();
    }

    public static <T>Result<T> successResult(T data){
        return new Result(data);
    }

    public static Result failResult(ResultCode resultCode, String message){
        return new Result(resultCode, message);
    }
}
