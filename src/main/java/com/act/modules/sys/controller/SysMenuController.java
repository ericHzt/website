package com.act.modules.sys.controller;

import com.act.common.base.controller.BaseController;
import com.act.common.base.entity.Page;
import com.act.modules.sys.entity.SysMenu;
import com.act.modules.sys.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping(value = "${adminPath}/sys/menu")
public class SysMenuController extends BaseController {

    @Autowired
    SysMenuService sysMenuService;

    @RequestMapping(value = "findlist")
    public String findList(SysMenu sysMenu, Model model, HttpServletRequest request, HttpServletResponse response){
        Page<SysMenu> sysMenus = sysMenuService.findPage(new Page<SysMenu>( request,  response),sysMenu);
        System.out.println(sysMenus.toString());
        addMessage(model,"success");
        model.addAttribute("list",sysMenus);
        return "index";
    }
}
