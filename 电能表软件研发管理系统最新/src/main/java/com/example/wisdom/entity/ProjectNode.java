package com.example.wisdom.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.github.jeffreyning.mybatisplus.anno.MppMultiId;
import lombok.Data;

import java.util.Date;

@Data
@TableName("t_project_node")
public class ProjectNode {
    @MppMultiId
    String projectNodeId;
    @MppMultiId
    String projectId;

    @TableField(value = "node_name")
    String nodeName;
    @TableField(value = "node_state_id")
    Integer nodeStateId;
    @TableField(value = "schedule_start_time")
    Date scheduleStartTime;
    @TableField(value = "actual_start_time")
    Date actualStartTime;
    @TableField(value = "schedule_end_time")
    Date scheduleEndTime;
    @TableField(value = "actual_end_time")
    Date actualEndTime;
    @TableField(value = "principal")
    String principal;
    @TableField(value = "node_progress")
    Integer nodeProgress;
    @TableField(value = "node_description")
    String nodeDescription;



}
