package com.example.wisdom.controller;

import com.example.wisdom.entity.CustomResponse;
import com.example.wisdom.entity.Permission;
import com.example.wisdom.entity.Role;
import com.example.wisdom.entity.VmRolePermission;
import com.example.wisdom.mapper.PermissionMapper;
import com.example.wisdom.mapper.RolePermissionMapper;
import com.example.wisdom.mapper.VmRolePermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class RolePermissionController {
    @Autowired
    RolePermissionMapper rolePermissionMapper;
    @Autowired
    PermissionMapper permissionMapper;
    @Autowired
    VmRolePermissionMapper vmRolePermissionMapper;

    //通过role——id，获取所有permission列表
    @GetMapping("/role/permissions")
    public CustomResponse getPermissionByUserId(@RequestParam("roleId")int id) {
        List<VmRolePermission>permissionIdList= (List<VmRolePermission>) vmRolePermissionMapper.selectById(id);
        if(permissionIdList != null) {
            return new CustomResponse(20000, "Login Success", permissionIdList);
        } else {
            return new CustomResponse(50008, "Error", null);
        }
    }
    @GetMapping("/role/permissionsId")
    public CustomResponse getPermissionIdByUserId(@RequestParam("roleId")int id) {
        List<Integer>permissionIdList= (List<Integer>) rolePermissionMapper.getPermissionsIdByRoleId(id);
        if(permissionIdList != null) {
            return new CustomResponse(20000, "Login Success", permissionIdList);
        } else {
            return new CustomResponse(50008, "Error", null);
        }
    }
}
