package com.hrd.auth.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * (AuthRolePremission)实体类
 *
 * @author makejava
 * @since 2024-03-24 20:42:17
 */
@Data
public class AuthRolePermissionBO implements Serializable {
    private static final long serialVersionUID = 108988966818800826L;

    private Long id;

    private Long roleId;

    private Long permissionId;

    private List<Long> permissionIdList;

}

