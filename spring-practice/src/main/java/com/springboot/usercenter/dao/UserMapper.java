package com.springboot.usercenter.dao;

import com.springboot.common.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Cherie on 2021/02/02
 **/
@Mapper
public interface UserMapper {

    @Select("select * from t_user where user_id=#{id}")
    public User findById(Long id);

}
