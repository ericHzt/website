package com.act.test.controller;


import com.act.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hello")
public class HelloController {
    @Autowired
    UserService userService;

    @RequestMapping("getHello")
    public String helloWorld(){
        return "index";
    }

    @RequestMapping("getUser")
    @ResponseBody
    public String getUser(String id){
        String userName = userService.getUserName(id);
        return userName;
    }
}
