package com.example.wisdom.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("vm_role_permission")
public class VmRolePermission {
    @TableId(value = "role_permission_id")
    Integer rolePermissionId;
    @TableField(value = "permission_id")
    Integer permissionId;
    @TableField("role_id")
    Integer roleId;
    @TableField("permission_name")
    String permissionName;
}
