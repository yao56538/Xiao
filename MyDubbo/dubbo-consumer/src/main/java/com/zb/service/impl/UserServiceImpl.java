package com.zb.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zb.entity.Order;
import com.zb.entity.TbUser;
import com.zb.mapper.UserMapper;
import com.zb.service.RPCService;
import com.zb.service.PRCUserService;
import com.zb.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Reference
    private RPCService rpcService;

    @Resource
    private UserMapper userMapper;


    @Override
    public List<Order> getByOrder(Integer uid) {
        return rpcService.getByOrderList(uid);
    }

    @Override
    public List<TbUser> getList() {
        return userMapper.getList();
    }
}
