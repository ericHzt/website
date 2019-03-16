package com.act.test.controller;


import com.act.common.base.controller.BaseController;
import com.act.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("${adminPath}/hello")
public class HelloController extends BaseController {
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
