package com.guus.gjtest.controller;

import com.guus.gjtest.bean.UserBean;
import com.guus.gjtest.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class HelloController {

    @Resource
    UserService userService;

    @RequestMapping("/index")
    public String sayHello() {
        UserBean userBean = userService.getInfo("耿杰", "gj");
        System.out.println(userBean.getId());
        return "index";
    }
}
