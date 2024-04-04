package com.hrd.auth.application.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (AuthPermission)DTO
 *
 * @author makejava
 * @since 2024-03-24 20:09:23
 */
@Data
public class AuthPermissionDTO implements Serializable {
    private static final long serialVersionUID = 777915322955911269L;

    private Long id;

    private String name;

    private Long parentId;

    private Integer type;

    private String menuUrl;

    private Integer status;

    private Integer show;

    private String icon;

    private String permissionKey;


}

