package com.guus.gjtest.controller;

import com.guus.gjtest.bean.User;
import com.guus.gjtest.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Slf4j
@Controller
public class HelloController {

    @Resource
    UserService userService;

    @RequestMapping("/index")
    public String sayHello() {
        User userBean = userService.getInfo("耿杰", "gj");
        System.out.println(userBean.getId());
        System.out.println(userService.testPlus("耿杰"));
        log.error("Error");
        return "index";
    }
}
