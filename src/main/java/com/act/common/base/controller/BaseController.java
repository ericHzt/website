package com.act.common.base.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

public abstract class BaseController {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    protected static final String REDIRECT = "redirect:";

    protected static final String FORWARD = "forward:";

    @Value("${adminPath}")
    protected String adminPath;

    @Value("${frontPath}")
    protected String frontPath;


    protected void addMessage(Model model,String... msg){
        StringBuilder sb = new StringBuilder();
        String msgs[] = msg;
        int length = msgs.length;
        for(int i = 0; i < length ; i++){
            sb.append(msgs[i].length()>0 ? msgs[i] : "");
        }
        model.addAttribute("message",msgs);
    }

    protected ModelAndView remoteAttribute(String objectName,Object object,String viewName){
        ModelAndView mav = new ModelAndView();
        mav.addObject(objectName,object);
        mav.setViewName(viewName);
        return mav;
    }

}
