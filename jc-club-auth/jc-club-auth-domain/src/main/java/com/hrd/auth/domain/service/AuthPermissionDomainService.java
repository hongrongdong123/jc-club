package com.hrd.auth.domain.service;

import com.hrd.auth.domain.entity.AuthPermissionBO;
import com.hrd.auth.domain.entity.AuthRoleBO;

import java.util.List;

/**
 * 角色领域service
 *
 * @author: ChickenWing
 * @date: 2023/11/1
 */
public interface AuthPermissionDomainService {

    Boolean add(AuthPermissionBO authPermissionBO);

    Boolean update(AuthPermissionBO authPermissionBO);

    Boolean delete(AuthPermissionBO authPermissionBO);

    List<String> getPermission(String userName);
}
