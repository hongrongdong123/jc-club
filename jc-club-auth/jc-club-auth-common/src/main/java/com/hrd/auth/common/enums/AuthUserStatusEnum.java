package com.hrd.auth.common.enums;

import lombok.Getter;

/**
 * description:用户状态枚举
 */
@Getter
public enum AuthUserStatusEnum {

    CLOSE(1, "禁用"),
    OPEN(0, "启用");

    public int code;
    public String desc;

    AuthUserStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static AuthUserStatusEnum getByCode(int codeVal) {
        for(AuthUserStatusEnum resultCodeEnum : AuthUserStatusEnum.values()) {
            if (resultCodeEnum.code == codeVal) {
                return resultCodeEnum;
            }
        }
        return null;
    }

}

