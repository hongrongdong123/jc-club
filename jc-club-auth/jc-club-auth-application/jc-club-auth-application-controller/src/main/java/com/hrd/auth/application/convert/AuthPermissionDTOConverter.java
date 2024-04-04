package com.hrd.auth.application.convert;

import com.hrd.auth.application.dto.AuthPermissionDTO;
import com.hrd.auth.application.dto.AuthRoleDTO;
import com.hrd.auth.domain.entity.AuthPermissionBO;
import com.hrd.auth.domain.entity.AuthRoleBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 权限dto转换器
 *
 * @author: ChickenWing
 * @date: 2023/10/8
 */
@Mapper
public interface AuthPermissionDTOConverter {

    AuthPermissionDTOConverter INSTANCE = Mappers.getMapper(AuthPermissionDTOConverter.class);

    AuthPermissionBO convertDTOToBO(AuthPermissionDTO authPermissionDTO);

}
