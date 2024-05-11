package com.example.wisdom.controller;


import com.example.wisdom.entity.CustomResponse;
import com.example.wisdom.entity.Role;
import com.example.wisdom.entity.User;
import com.example.wisdom.mapper.RoleMapper;
import com.example.wisdom.mapper.UserMapper;
import com.example.wisdom.mapper.UserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;

    //增
    @PostMapping("user")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        //userService.save(user);
        int result = userMapper.insert(user);
        if(result > 0) {
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    // 删
    @DeleteMapping("user")
    public ResponseEntity<?> deleteUser(@RequestParam("id") int id) {
        // 根据请求参数中的 ID 删除权限
        int result = userMapper.deleteById(id);
        return null;
    }

    // 改
    @PutMapping("user")
    public ResponseEntity<?> updatePermission(@RequestParam("id") int id, @RequestBody User updatedUser) {
        updatedUser.setUserId(id); // 设置更新的用户ID
        userMapper.updateById(updatedUser);
        return ResponseEntity.ok().build();
    }

    // 查询所有
    @GetMapping("/user/all")
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(userMapper.selectList(null));
    }

    // 查询一个
    @GetMapping("user")
    public User getUserById(@RequestParam("id")int id) {
        User user = userMapper.selectById(id);
        if (user != null) {
            return user;
        } else {
            return null;
        }

    }

    @GetMapping("/user/role")
    public CustomResponse getRoleIdByUserId(@RequestParam("userId")int id) {
        int roleId= userRoleMapper.getRoleIdByUserId(id);
        Role role=roleMapper.selectById(roleId);
        if(role != null) {
            return new CustomResponse(20000, "Login Success", role);
        } else {
            return new CustomResponse(50008, "Error", null);
        }
    }


}
