package com.hrd.auth.domain.convert;

import com.hrd.auth.domain.entity.AuthRoleBO;
import com.hrd.auth.infra.basic.entity.AuthRole;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-01T15:30:22+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
public class AuthRoleBOConverterImpl implements AuthRoleBOConverter {

    @Override
    public AuthRole convertBOToEntity(AuthRoleBO authRoleBO) {
        if ( authRoleBO == null ) {
            return null;
        }

        AuthRole authRole = new AuthRole();

        authRole.setId( authRoleBO.getId() );
        authRole.setRoleName( authRoleBO.getRoleName() );
        authRole.setRoleKey( authRoleBO.getRoleKey() );

        return authRole;
    }

    @Override
    public AuthRoleBO convertEntityToBO(AuthRole authRole) {
        if ( authRole == null ) {
            return null;
        }

        AuthRoleBO authRoleBO = new AuthRoleBO();

        authRoleBO.setId( authRole.getId() );
        authRoleBO.setRoleName( authRole.getRoleName() );
        authRoleBO.setRoleKey( authRole.getRoleKey() );

        return authRoleBO;
    }
}
