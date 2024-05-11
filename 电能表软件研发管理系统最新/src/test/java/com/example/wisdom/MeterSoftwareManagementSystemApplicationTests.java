package com.example.wisdom;

import com.example.wisdom.entity.Permission;
import com.example.wisdom.entity.Role;
import com.example.wisdom.entity.User;
import com.example.wisdom.mapper.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@SpringBootTest
class MeterSoftwareManagementSystemApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    UserRoleMapper userRoleMapper;
    @Autowired
    RolePermissionMapper rolePermissionMapper;
    @Autowired
    PermissionMapper permissionMapper;
    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void userLogin(){
        System.out.println(userMapper.SelectByUsernameAndPassword("111", "111"));
    }

    @Test
    void userrole() {
        List<Permission>permissionList=null;
        List<Integer>permissionIdList= (List<Integer>) rolePermissionMapper.getPermissionIdByRoleId(1);
        for (Integer permissionId : permissionIdList) {
            System.out.println(permissionMapper.selectById(permissionId));
        }
    }

    @Test
    public void getRoleIdByUserId() {
        int roleId= userRoleMapper.getRoleIdByUserId(1);
        Role role=roleMapper.selectById(roleId);
        System.out.println(role);
    }


}
