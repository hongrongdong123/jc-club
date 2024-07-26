package com.hrd.interview.server.rpc;

import com.hrd.auth.api.UserFeignService;
import com.hrd.auth.entity.AuthUserDTO;
import com.hrd.auth.entity.Result;
import com.hrd.interview.server.entity.dto.UserInfo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;



@Component
public class UserRpc {

    @Resource
    private UserFeignService userFeignService;

    public UserInfo getUserInfo(String userName) {
        AuthUserDTO authUserDTO = new AuthUserDTO();
        authUserDTO.setUserName(userName);
        Result<AuthUserDTO> result = userFeignService.getUserInfo(authUserDTO);
        UserInfo userInfo = new UserInfo();
        if (!result.getSuccess()) {
            return userInfo;
        }
        AuthUserDTO data = result.getData();
        userInfo.setUserName(data.getUserName());
        userInfo.setNickName(data.getNickName());
        userInfo.setAvatar(data.getAvatar());
        return userInfo;
    }

}
