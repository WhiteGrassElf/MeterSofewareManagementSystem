package com.example.wisdom;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.wisdom.entity.*;
import com.example.wisdom.mapper.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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

//    @Test
//    public void userLogin(){
//        System.out.println(userMapper.SelectByUsernameAndPassword("111", "111"));
//    }

    @Test
    void userrole() {
        List<Permission>permissionList=null;
        List<Integer>permissionIdList= (List<Integer>) rolePermissionMapper.getPermissionsIdByRoleId(1);
        for (Integer permissionId : permissionIdList) {
            permissionList.add(permissionMapper.selectById(permissionId));
        }
        System.out.println(permissionList);
    }

    @Test
    public void getRoleIdByUserId() {
        UserRole userRole= userRoleMapper.selectById(1);
        Role role=roleMapper.selectById(userRole.getRoleId());
        System.out.println(role);
    }


}
