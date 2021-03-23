package com.guus.gjtest.service;

import com.guus.gjtest.bean.User;

public interface UserService {

    User getInfo(String name, String password);

    String testPlus(String name);
}
