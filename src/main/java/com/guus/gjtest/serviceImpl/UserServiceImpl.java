package com.guus.gjtest.serviceImpl;

import com.guus.gjtest.bean.UserBean;
import com.guus.gjtest.mapper.UserMapper;
import com.guus.gjtest.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserBean getInfo(String name, String password) {
        return userMapper.getInfo(name, password);
    }
}
