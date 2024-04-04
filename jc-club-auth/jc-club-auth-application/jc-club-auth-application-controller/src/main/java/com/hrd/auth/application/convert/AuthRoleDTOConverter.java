package com.hrd.auth.application.convert;


import com.hrd.auth.application.dto.AuthRoleDTO;

import com.hrd.auth.domain.entity.AuthRoleBO;
import com.hrd.auth.domain.entity.AuthUserBO;
import com.hrd.auth.entity.AuthUserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 角色DTO转换器
 */
@Mapper
public interface AuthRoleDTOConverter {

    AuthRoleDTOConverter INSTANCE = Mappers.getMapper(AuthRoleDTOConverter.class);

    AuthRoleBO convertDTOToBO(AuthRoleDTO authRoleDTO);

    AuthUserDTO convertBOToDTO(AuthUserBO authUserBO);

}

