package com.example.wisdom.controller;

import com.example.wisdom.entity.Role;
import com.example.wisdom.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("roles")
public class RoleController {
    @Autowired
    RoleMapper roleMapper;

    // 查询一个
    @GetMapping
    public Role getRoleById(@RequestParam("id")int id) {
        Role role = roleMapper.selectById(id);
        if (role != null) {
            return role;
        } else {
            return null;
        }
    }
}
