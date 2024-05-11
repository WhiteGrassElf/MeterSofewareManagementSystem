package com.example.wisdom.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.wisdom.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {
    @Select("select role_id from t_user_role where user_id = #{user_id}")
    int getRoleIdByUserId(int user_id);
}
