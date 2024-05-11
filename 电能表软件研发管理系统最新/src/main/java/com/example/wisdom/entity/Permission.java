package com.example.wisdom.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_permission")
public class Permission {
        @TableId(value = "permission_id",type = IdType.AUTO)
        Integer permissionId;
        @TableField(value = "permission_name")
        String permissionName;
}
