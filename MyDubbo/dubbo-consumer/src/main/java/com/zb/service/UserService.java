package com.zb.service;

import com.zb.entity.Order;
import com.zb.entity.TbUser;

import java.util.List;

public interface UserService {
    List<Order> getByOrder(Integer uid);
    List<TbUser> getList();
}
