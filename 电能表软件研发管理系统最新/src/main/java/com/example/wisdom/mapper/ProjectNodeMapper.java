package com.example.wisdom.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.wisdom.entity.ProjectNode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ProjectNodeMapper  extends BaseMapper<ProjectNode> {
    @Select("select node_state_id from t_project_node where project_id = #{id} AND node_progress!=0 AND node_progress!=100 limit 1")
    Integer getNewProjectNodeStateId(int id);

}
