package com.example.wisdom.controller;

import com.example.wisdom.entity.CustomResponse;
import com.example.wisdom.entity.ProjectInfo;
import com.example.wisdom.mapper.ProjectInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectInfoController {
    @Autowired
    ProjectInfoMapper projectInfoMapper;

    // 查询所有
    @GetMapping("/project")
    public CustomResponse getAllProjectInfos() {
        List<ProjectInfo> list=projectInfoMapper.selectList(null);
        if(list != null) {
            return new CustomResponse(20000, "Login Success", list);
        } else {
            return new CustomResponse(50008, "Error", null);
        }
    }

    @GetMapping("/project{projectId}")
    public CustomResponse getProjectInfoById( @PathVariable("projectId") Integer projectId){
        ProjectInfo projectInfo = projectInfoMapper.selectById(projectId);
        if(projectInfo != null) {
            return new CustomResponse(20000, "Login Success", projectInfo);
        } else {
            return new CustomResponse(50008, "Error", null);
        }
    }



}
