package com.hrd.subject.common.util;


import com.hrd.subject.common.context.LoginContextHolder;

/**
 * description:
 */
public class LoginUtil {

    public static String getLoginId() {
        return LoginContextHolder.getLoginId("loginId");
    }
}
