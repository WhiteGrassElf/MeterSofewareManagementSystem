package com.example.wisdom.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("t_project_info")
public class ProjectInfo {
    @TableId(value = "project_id",type = IdType.AUTO)
    Integer projectId;
    @TableField(value = "project_difficulty")
    String projectDifficulty;
    @TableField(value = "project_serial_number")
    String projectSerialNumber;
    @TableField(value = "product_category")
    String productCategory;
    @TableField(value = "region")
    String region;
    @TableField(value = "specification")
    String specification;
    @TableField(value = "product_name")
    String productName;
    @TableField(value = "manufacturer")
    String manufacturer;
    @TableField(value = "voltage_spec")
    String voltageSpec;
    @TableField(value = "current_spec")
    String currentSpec;
    @TableField(value = "winning_quantity")
    Integer winningQuantity;
    @TableField(value = "target_time")
    Date target_time;
    @TableField(value = "project_description")
    String projectDescription;

}
