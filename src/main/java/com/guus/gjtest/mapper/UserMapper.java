package com.guus.gjtest.mapper;

import com.guus.gjtest.bean.UserBean;

public interface UserMapper {

    UserBean getInfo(String name, String password);
}
