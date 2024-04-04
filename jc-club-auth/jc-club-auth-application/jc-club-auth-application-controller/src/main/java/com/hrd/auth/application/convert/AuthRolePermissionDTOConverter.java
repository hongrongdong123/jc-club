package com.hrd.auth.application.convert;

import com.hrd.auth.application.dto.AuthPermissionDTO;
import com.hrd.auth.application.dto.AuthRolePermissionDTO;
import com.hrd.auth.domain.entity.AuthPermissionBO;
import com.hrd.auth.domain.entity.AuthRolePermissionBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 权限dto转换器
 *
 * @author: ChickenWing
 * @date: 2023/10/8
 */
@Mapper
public interface AuthRolePermissionDTOConverter {

    AuthRolePermissionDTOConverter INSTANCE = Mappers.getMapper(AuthRolePermissionDTOConverter.class);

    AuthRolePermissionBO convertDTOToBO(AuthRolePermissionDTO authRolePermissionDTO);

}
