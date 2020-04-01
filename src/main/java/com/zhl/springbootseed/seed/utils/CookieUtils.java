package com.zhl.springbootseed.seed.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * cookie相关操作
 * @author Huanlin-ZHL
 * @date 2020/4/1 19:56
 */
public class CookieUtils {

    private static int DEFAULT_COOKIE_MAX_AGE = 900;

    public static String readCookie(HttpServletRequest request, String cookieName){
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals(cookieName)){
                    return cookie.getValue();
                }
            }
        }

        return null;
    }

    public static void writeCookie(HttpServletResponse response, String cookieName, String cookieValue){
        Cookie cookie = new Cookie(cookieName, cookieValue);
        cookie.setPath("/");
        cookie.setMaxAge(DEFAULT_COOKIE_MAX_AGE);
        response.addCookie(cookie);
    }

    public static void writeCookie(HttpServletResponse response, String cookieName, String cookieValue, int cookieTime){
        Cookie cookie = new Cookie(cookieName, cookieValue);
        cookie.setPath("/");
        cookie.setMaxAge(cookieTime);
        response.addCookie(cookie);
    }
}
