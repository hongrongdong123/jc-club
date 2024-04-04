package com.hrd.subject.common.context;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * description:登录上下文对象
 */
public class LoginContextHolder {

    public static final InheritableThreadLocal<Map<String, Object>> THREAD_LOCAL
            = new InheritableThreadLocal<>();

    public static Map<String, Object> getThreadLocalMap() {
        Map<String, Object> map = THREAD_LOCAL.get();
        if (Objects.isNull(map)) {
            map = new ConcurrentHashMap<>();
            THREAD_LOCAL.set(map);
        }
        return map;
    }
    public static void set(String key, Object val) {
        Map<String, Object> threadLocalMap = getThreadLocalMap();
        threadLocalMap.put(key, val);
    }
    public static Object get(String key) {
        Map<String, Object> threadLocalMap = getThreadLocalMap();
        return threadLocalMap.get(key);
    }

    public static String getLoginId(String key) {
        return (String) get(key);
    }
    public static void remove() {
        THREAD_LOCAL.remove();
    }
}


