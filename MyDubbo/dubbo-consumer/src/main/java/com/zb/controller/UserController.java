package com.zb.controller;

import com.zb.entity.Order;
import com.zb.entity.TbUser;
import com.zb.service.PRCUserService;
import com.zb.service.UserService;
import com.zb.service.impl.RPCUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService  userService;

    @Resource
    private RPCUserServiceImpl rpcUserService;

    @GetMapping("/show")
    public List<Order> show(){
        return userService.getByOrder(1);
    }

    @GetMapping("/look")
    public List<TbUser> look(){
        return userService.getList();
    }

    @GetMapping("/cc")
    public List<TbUser> cc(){
        return rpcUserService.getList();
    }

}
