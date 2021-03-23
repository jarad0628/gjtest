package com.guus.gjtest.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.guus.gjtest.bean.User;
import com.guus.gjtest.mapper.UserMapper;
import com.guus.gjtest.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getInfo(String name, String password) {
        return userMapper.getInfo(name, password);
    }

    @Override
    public String testPlus(String name) {
        Optional<User> optional = userMapper.selectList(new LambdaQueryWrapper<User>()
                .eq(User::getName, name)).stream().findFirst();
        return optional.get().getPassword();
    }

}
