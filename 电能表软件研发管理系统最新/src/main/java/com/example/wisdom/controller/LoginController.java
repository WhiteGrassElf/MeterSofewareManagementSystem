package com.example.wisdom.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.wisdom.entity.CustomResponse;
import com.example.wisdom.entity.User;
import com.example.wisdom.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//spring boot 提供了 @Controller 和 @RestController
//如果 请求的是页面和数据，使用@Controller注解即可 就需要返回视图，也就是需要返回一个页面
//如果 只有请求数据，使用@RestController 就返回数据以文本形式返回给前端，默认情况下返回对象会将对象数据转换为JSON格式
@RestController
//@RequestMapping("vue-element-admin")
public class LoginController {

    @Autowired
    private UserMapper userMapper;

    @PostMapping("/user/login")
    public CustomResponse userLogin(@RequestBody User user){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username",user.getUsername());
        wrapper.eq("nickname",user.getPassword());
        User userData = userMapper.selectOne(wrapper);
//        User userData = userMapper.SelectByUsernameAndPassword(user.getUsername(),user.getPassword());
        if(userData != null) {
            return new CustomResponse(20000, "Login Success", userData);
        } else {
            return new CustomResponse(50008, "Error", null);
        }
    }

    @PostMapping("/user/logout")
    public CustomResponse userLogout(){
        return new CustomResponse(20000, "Logout Success", null);
    }
}
