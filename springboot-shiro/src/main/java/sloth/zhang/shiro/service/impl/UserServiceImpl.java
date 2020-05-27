package sloth.zhang.shiro.service.impl;


import sloth.zhang.shiro.mapper.UserMapper;
import sloth.zhang.shiro.pojo.User;
import sloth.zhang.shiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserByName(String userName) {
        return userMapper.queryUserByName(userName) ;
    }

}
