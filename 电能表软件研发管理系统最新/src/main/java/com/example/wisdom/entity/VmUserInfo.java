package com.example.wisdom.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("vm_user_info")
public class VmUserInfo {

    @TableId(value = "user_id")
    Integer userId;
    @TableField("username")
    String userName;
    @TableField("password")
    String password;
    @TableField("phone")
    String phone;
    @TableField("nickname")
    String nickname;
    @TableField("role_id")
    Integer roleId;
    @TableField("role_name")
    String roleName;
}
