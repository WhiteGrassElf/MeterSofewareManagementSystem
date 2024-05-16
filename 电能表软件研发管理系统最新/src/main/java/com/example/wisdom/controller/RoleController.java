package com.example.wisdom.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.wisdom.entity.CustomResponse;
import com.example.wisdom.entity.Role;
import com.example.wisdom.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleController {
    @Autowired
    RoleMapper roleMapper;

    // 查询一个
    @GetMapping("/role")
    public CustomResponse getRoleById(@RequestParam("id")int id) {
        Role role = roleMapper.selectById(id);
        if (role != null) {
            return new CustomResponse(20000, "查询成功", role);
        } else {
            return new CustomResponse(50008, "Error", null);
        }
    }

    @GetMapping("/roles")
    public CustomResponse getRoles(@RequestParam(defaultValue = "1") Integer current,
                                   @RequestParam(defaultValue = "10") Integer size){

        Page<Role> page = new Page<>(current, size);
        IPage<Role> iPage = new Page<Role>();
        iPage = roleMapper.selectPage(page,null);
        if (iPage != null) {
            return new CustomResponse(20000, "查询成功", iPage);
        } else {
            return new CustomResponse(50008, "Error", null);
        }
    }

    @PostMapping("/role")
    public CustomResponse addRole(@RequestParam Role role){
        QueryWrapper queryWrapper = new QueryWrapper<Role>();
        queryWrapper.eq("role_name",role.getRoleName());
        Role temp = roleMapper.selectOne(queryWrapper);
        if(temp == null){
            if(roleMapper.insert(role) != 0){
                return new CustomResponse(20000, "插入成功", null);
            }
            else{
                return new CustomResponse(50008, "插入失败", null);
            }
        }else {
            return new CustomResponse(50008, "角色名重复", null);
        }
    }

    @PutMapping("/role/{id}")
    public CustomResponse updateRole(@RequestParam Role role, @PathVariable String id){
        UpdateWrapper updateWrapper = new UpdateWrapper<Role>();
        updateWrapper.eq("role_id",id);
        if(roleMapper.update(role,updateWrapper) != 0){
            return new CustomResponse(20000, "更新成功", null);
        }
        else{
            return new CustomResponse(50008, "更新失败", null);
        }
    }
    @DeleteMapping("/role/{id}")
    public CustomResponse deleteRole(@PathVariable String id){
        if(roleMapper.deleteById(id) != 0){
            return new CustomResponse(20000, "删除成功", null);
        }
        else{
            return new CustomResponse(50008, "删除失败", null);
        }
    }

}
