package com.zb.service;

import com.zb.entity.Order;

import java.util.List;

public interface RPCService {
    public List<Order> getByOrderList(Integer uid);

}
