package com.example.wisdom.controller;

import com.example.wisdom.entity.CustomResponse;
import com.example.wisdom.mapper.ProjectNodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectNodeController {

    @Autowired
    ProjectNodeMapper projectNodeMapper;

    //  /project/count{stateId}
    @RequestMapping("/project/count{projectId}")
    public CustomResponse getRole(@PathVariable("projectId") Integer projectId){
        Integer stateId=projectNodeMapper.getNewProjectNodeStateId(projectId);
        if(stateId != null) {
            return new CustomResponse(20000, "Login Success", stateId);
        } else {
            return new CustomResponse(50008, "Error", null);
        }
    }
}
