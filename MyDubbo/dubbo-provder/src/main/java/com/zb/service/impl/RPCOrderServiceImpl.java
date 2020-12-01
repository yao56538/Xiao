package com.zb.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zb.entity.Order;
import com.zb.service.RPCService;

import java.util.ArrayList;
import java.util.List;

@Service
public class RPCOrderServiceImpl implements RPCService {

    private static List<Order> lists = new ArrayList<>();

    static {
        lists.add(new Order(1, "订单1", "", 20.0));
        lists.add(new Order(2, "订单2", "", 20.0));
        lists.add(new Order(3, "订单3", "", 20.0));
        lists.add(new Order(4, "订单4", "", 20.0));
    }


    @Override
    public List<Order> getByOrderList(Integer uid) {
        System.out.println("服务调用");
        try{
           Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        return lists;
    }
}
