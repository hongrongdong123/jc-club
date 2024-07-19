package com.hrd.auth.application.convert;

import com.hrd.auth.application.dto.AuthPermissionDTO;
import com.hrd.auth.domain.entity.AuthPermissionBO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-15T15:37:35+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
public class AuthPermissionDTOConverterImpl implements AuthPermissionDTOConverter {

    @Override
    public AuthPermissionBO convertDTOToBO(AuthPermissionDTO authPermissionDTO) {
        if ( authPermissionDTO == null ) {
            return null;
        }

        AuthPermissionBO authPermissionBO = new AuthPermissionBO();

        authPermissionBO.setId( authPermissionDTO.getId() );
        authPermissionBO.setName( authPermissionDTO.getName() );
        authPermissionBO.setParentId( authPermissionDTO.getParentId() );
        authPermissionBO.setType( authPermissionDTO.getType() );
        authPermissionBO.setMenuUrl( authPermissionDTO.getMenuUrl() );
        authPermissionBO.setStatus( authPermissionDTO.getStatus() );
        authPermissionBO.setShow( authPermissionDTO.getShow() );
        authPermissionBO.setIcon( authPermissionDTO.getIcon() );
        authPermissionBO.setPermissionKey( authPermissionDTO.getPermissionKey() );

        return authPermissionBO;
    }
}
