package com.zb.mapper;


import com.zb.entity.TbUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;



@Mapper
public interface UserMapper {
    List<TbUser> getList();

}
