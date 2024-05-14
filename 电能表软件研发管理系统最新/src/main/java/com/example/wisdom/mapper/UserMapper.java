package com.example.wisdom.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.wisdom.entity.User;
import com.example.wisdom.entity.VmUserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User>{
//    @Select("select * from t_user where username = #{username} And password = #{password}  limit 1")
//    public User SelectByUsernameAndPassword(String username,String password);
}
