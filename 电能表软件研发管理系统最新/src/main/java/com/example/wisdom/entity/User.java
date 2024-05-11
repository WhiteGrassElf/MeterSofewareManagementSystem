package com.example.wisdom.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_user")
public class User {
    @TableId(value = "user_id",type = IdType.AUTO)
    Integer userId;
    @TableField(value = "username")
    String username;
    @TableField(value = "password")
    String password;
    @TableField(value = "nickname")
    String nickname;
    @TableField(value = "phone")
    String phone;
}
