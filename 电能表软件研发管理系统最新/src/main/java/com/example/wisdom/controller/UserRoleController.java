package com.example.wisdom.controller;

import com.example.wisdom.entity.User;
import com.example.wisdom.entity.UserRole;
import com.example.wisdom.mapper.UserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user_role")
public class UserRoleController {
    @Autowired
    UserRoleMapper userRoleMapper;
    //根据用户id查询其所有role id
    @GetMapping
    public List<Integer> getRoleIdByUserId(@RequestParam("id")int id) {
        List<Integer> list= (List<Integer>) userRoleMapper.selectById(id);
        return list;
    }

}
