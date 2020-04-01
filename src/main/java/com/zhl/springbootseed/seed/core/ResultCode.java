package com.zhl.springbootseed.seed.core;

import lombok.Getter;

/**
 * @author Huanlin-ZHL
 * @date 2020/4/1 19:17
 */
public enum ResultCode {
    SUCCESS(200),
    INNEROR_SERVER_ERROR(500);

    @Getter
    private final int code;

    ResultCode(int code){
        this.code = code;
    }
}
