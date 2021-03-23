package com.guus.gjtest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guus.gjtest.bean.User;

public interface UserMapper extends BaseMapper<User> {

    User getInfo(String name, String password);
}
