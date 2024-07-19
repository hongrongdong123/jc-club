package com.hrd.auth.infra.basic.service.impl;

import com.hrd.auth.infra.basic.entity.AuthRole;
import com.hrd.auth.infra.basic.mapper.AuthRoleDao;
import com.hrd.auth.infra.basic.service.AuthRoleService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import java.util.List;


/**
 * (AuthRole)表服务实现类
 *
 * @author makejava
 * @since 2024-03-24 18:55:07
 */
@Service("authRoleService")
public class AuthRoleServiceImpl implements AuthRoleService {
    @Resource
    private AuthRoleDao authRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AuthRole queryById(Long id) {
        return this.authRoleDao.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param authRole 实例对象
     * @return 实例对象
     */
    @Override
    public Integer insert(AuthRole authRole) {
        return this.authRoleDao.insert(authRole);
    }

    /**
     * 修改数据
     *
     * @param authRole 实例对象
     * @return 实例对象
     */
    @Override
    public Integer update(AuthRole authRole) {
        return this.authRoleDao.update(authRole);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.authRoleDao.deleteById(id) > 0;
    }

    @Override
    public AuthRole queryByCondition(AuthRole authRole) {
        return authRoleDao.queryAllByLimit(authRole);
    }

    @Override
    public List<AuthRole> queryByRoleList(List<Long> roleIdList) {
        return authRoleDao.queryByRoleList(roleIdList);
    }

}
