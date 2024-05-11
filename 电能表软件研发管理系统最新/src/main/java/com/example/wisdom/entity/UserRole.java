package com.example.wisdom.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@Data
@TableName("t_user_role")
public class UserRole {
    @TableId(value = "user_role_id",type = IdType.AUTO)
    Integer userRoleId;
    @TableField(value = "user_id")
    Integer userId;
    @TableField(value = "role_id")
    Integer roleId;

}
