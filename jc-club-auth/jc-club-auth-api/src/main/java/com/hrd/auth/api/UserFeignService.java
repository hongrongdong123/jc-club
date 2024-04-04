package com.hrd.auth.api;

import com.hrd.auth.entity.AuthUserDTO;
import com.hrd.auth.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("jc-club-auth")
public interface UserFeignService {


    @RequestMapping("/user/getUserInfo")
    public Result<AuthUserDTO> getUserInfo(@RequestBody AuthUserDTO authUserDTO);


}
