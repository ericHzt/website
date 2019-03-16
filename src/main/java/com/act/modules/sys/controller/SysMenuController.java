package com.act.modules.sys.controller;

import com.act.common.base.controller.BaseController;
import com.act.modules.sys.entity.SysMenu;
import com.act.modules.sys.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "${adminPath}/sys/menu")
public class SysMenuController extends BaseController {

    @Autowired
    SysMenuService sysMenuService;

    @RequestMapping(value = "findlist")
    public String findList(SysMenu sysMenu,Model model){
        List<SysMenu> sysMenus = sysMenuService.findlist(sysMenu);
        addMessage(model,"success");
        model.addAttribute("list",sysMenus);
        return "index";
    }
}
