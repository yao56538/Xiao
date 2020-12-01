package com.zb.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zb.entity.TbUser;
import com.zb.mapper.UserMapper;
import com.zb.service.PRCUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class RPCUserServiceImpl implements PRCUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<TbUser> getList() {
        return userMapper.getList();
    }
}
