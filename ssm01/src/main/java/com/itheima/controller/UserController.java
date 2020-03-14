package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    /*
     * 根据id查询用户详情
     */
    @RequestMapping("/findAll")
    public String findAll(){
        List<User> users = userService.findAll();
        for (User user : users) {

            System.out.println(user);
        }

        //返回用户信息展示页面
        return "user";
    }
    @RequestMapping("/findUserById")
    public String findUserById(Model model){
        User user = userService.findUserById(1);
        System.out.println(user);
        model.addAttribute("user",user);
        return "user";
    }
    @RequestMapping("/test")
    public String test(){
        return "user";
    }

}
