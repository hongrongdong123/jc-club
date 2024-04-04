package com.hrd.auth.application.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (AuthRole)实体类
 *
 * @author makejava
 * @since 2024-03-24 18:55:07
 */
@Data
public class AuthRoleDTO implements Serializable {
    private static final long serialVersionUID = 533754206189659698L;

    private Long id;

    private String roleName;

    private String roleKey;


}

