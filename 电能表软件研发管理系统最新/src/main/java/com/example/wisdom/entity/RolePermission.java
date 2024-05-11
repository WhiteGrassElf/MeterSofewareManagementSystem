package com.example.wisdom.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_role_permission")
public class RolePermission {
    @TableId(value = "role_permission_id",type = IdType.AUTO)
    Integer rolePermissionId;
    @TableField(value = "permission_id")
    String permissionId;
    @TableField(value = "role_id")
    String roleId;
}
