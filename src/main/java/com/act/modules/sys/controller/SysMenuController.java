package com.act.modules.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "sys/menu")
public class SysMenuController {

    @RequestMapping(value = "findlist")
    public String findList(){
        return "";
    }
}
