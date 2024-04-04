package com.hrd.auth.domain.convert;



import com.hrd.auth.domain.entity.AuthRoleBO;
import com.hrd.auth.domain.entity.AuthUserBO;
import com.hrd.auth.infra.basic.entity.AuthRole;
import com.hrd.auth.infra.basic.entity.AuthUser;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthRoleBOConverter {

    AuthRoleBOConverter INSTANCE = Mappers.getMapper(AuthRoleBOConverter.class);

    AuthRole convertBOToEntity(AuthRoleBO authRoleBO);

    AuthRoleBO convertEntityToBO(AuthRole authRole);


}

