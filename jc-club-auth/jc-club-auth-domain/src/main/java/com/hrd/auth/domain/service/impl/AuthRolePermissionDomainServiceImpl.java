package com.hrd.auth.domain.service.impl;

import com.hrd.auth.common.enums.IsDeletedFlagEnum;
import com.hrd.auth.domain.convert.AuthPermissionBOConverter;
import com.hrd.auth.domain.entity.AuthPermissionBO;
import com.hrd.auth.domain.entity.AuthRolePermissionBO;
import com.hrd.auth.domain.service.AuthPermissionDomainService;
import com.hrd.auth.domain.service.AuthRolePermissionDomainService;
import com.hrd.auth.infra.basic.entity.AuthPermission;
import com.hrd.auth.infra.basic.entity.AuthRolePermission;
import com.hrd.auth.infra.basic.service.AuthPermissionService;
import com.hrd.auth.infra.basic.service.AuthRolePermissionService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.util.LinkedList;
import java.util.List;

@Service
@Slf4j
public class AuthRolePermissionDomainServiceImpl implements AuthRolePermissionDomainService {

    @Resource
    private AuthRolePermissionService authRolePermissionService;

    @Override
    public Boolean add(AuthRolePermissionBO authRolePermissionBO) {
        List<AuthRolePermission> rolePermissionList = new LinkedList<>();
        Long roleId = authRolePermissionBO.getRoleId();
        authRolePermissionBO.getPermissionIdList().forEach(permissionId -> {
            AuthRolePermission authRolePermission = new AuthRolePermission();
            authRolePermission.setRoleId(roleId);
            authRolePermission.setPermissionId(permissionId);
            authRolePermission.setIsDeleted(IsDeletedFlagEnum.UN_DELETED.getCode());
            rolePermissionList.add(authRolePermission);
        });
        int count = authRolePermissionService.batchInsert(rolePermissionList);
        return count > 0;
    }


}
