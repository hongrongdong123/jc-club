package com.hrd.auth.application.convert;

import com.hrd.auth.application.dto.AuthRoleDTO;
import com.hrd.auth.domain.entity.AuthRoleBO;
import com.hrd.auth.domain.entity.AuthUserBO;
import com.hrd.auth.entity.AuthUserDTO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-15T15:37:35+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
public class AuthRoleDTOConverterImpl implements AuthRoleDTOConverter {

    @Override
    public AuthRoleBO convertDTOToBO(AuthRoleDTO authRoleDTO) {
        if ( authRoleDTO == null ) {
            return null;
        }

        AuthRoleBO authRoleBO = new AuthRoleBO();

        authRoleBO.setId( authRoleDTO.getId() );
        authRoleBO.setRoleName( authRoleDTO.getRoleName() );
        authRoleBO.setRoleKey( authRoleDTO.getRoleKey() );

        return authRoleBO;
    }

    @Override
    public AuthUserDTO convertBOToDTO(AuthUserBO authUserBO) {
        if ( authUserBO == null ) {
            return null;
        }

        AuthUserDTO authUserDTO = new AuthUserDTO();

        authUserDTO.setId( authUserBO.getId() );
        authUserDTO.setUserName( authUserBO.getUserName() );
        authUserDTO.setNickName( authUserBO.getNickName() );
        authUserDTO.setEmail( authUserBO.getEmail() );
        authUserDTO.setPhone( authUserBO.getPhone() );
        authUserDTO.setPassword( authUserBO.getPassword() );
        authUserDTO.setSex( authUserBO.getSex() );
        authUserDTO.setAvatar( authUserBO.getAvatar() );
        authUserDTO.setStatus( authUserBO.getStatus() );
        authUserDTO.setIntroduce( authUserBO.getIntroduce() );
        authUserDTO.setExtJson( authUserBO.getExtJson() );
        authUserDTO.setCreatedBy( authUserBO.getCreatedBy() );
        authUserDTO.setCreatedTime( authUserBO.getCreatedTime() );
        authUserDTO.setUpdateBy( authUserBO.getUpdateBy() );
        authUserDTO.setUpdateTime( authUserBO.getUpdateTime() );
        authUserDTO.setIsDeleted( authUserBO.getIsDeleted() );

        return authUserDTO;
    }
}
