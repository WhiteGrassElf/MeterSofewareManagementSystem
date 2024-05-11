package com.example.wisdom.controller;//package com.wisdom.version.controller.base;

import com.example.wisdom.entity.Permission;
import com.example.wisdom.entity.Role;
import com.example.wisdom.mapper.PermissionMapper;
import com.example.wisdom.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("permissions")
public class PermissionController {
    @Autowired
    PermissionMapper permissionMappper;

    // 查询一个
    @GetMapping
    public Permission getPermissionById(@RequestParam("id")int id) {
        Permission permission = permissionMappper.selectById(id);
        if (permission != null) {
            return permission;
        } else {
            return null;
        }
    }

}

