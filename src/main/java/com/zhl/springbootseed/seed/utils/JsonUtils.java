package com.zhl.springbootseed.seed.utils;

import com.google.gson.Gson;

/**
 * Json格式转换工具包
 * @author Huanlin-ZHL
 * @date 2020/4/1 19:09
 */
public class JsonUtils {
    private static Gson gson = new Gson();


    public static String toJson(Object object){
        return gson.toJson(object);
    }

    public static <T>T fromJson(String jsonStr, Class<T> clazz){
        return gson.fromJson(jsonStr, clazz);
    }

}
