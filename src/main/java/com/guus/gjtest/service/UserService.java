package com.guus.gjtest.service;

import com.guus.gjtest.bean.UserBean;

public interface UserService {

    UserBean getInfo(String name, String password);
}
