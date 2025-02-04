package com.hrd.auth.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (AuthRole)实体类
 *
 * @author makejava
 * @since 2024-03-24 18:55:07
 */
@Data
public class AuthRoleBO implements Serializable {
    private static final long serialVersionUID = 533754206189659698L;

    private Long id;

    private String roleName;

    private String roleKey;


}

