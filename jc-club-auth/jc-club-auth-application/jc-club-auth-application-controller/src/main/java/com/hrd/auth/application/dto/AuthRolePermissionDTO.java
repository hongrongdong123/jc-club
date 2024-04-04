package com.hrd.auth.application.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * (AuthRolePremission)实体类
 *
 * @author makejava
 * @since 2024-03-24 20:42:17
 */
@Data
public class AuthRolePermissionDTO implements Serializable {
    private static final long serialVersionUID = 108988966818800826L;

    private Long id;

    private Long roleId;

    private Long permissionId;

    private List<Long> permissionIdList;

}

