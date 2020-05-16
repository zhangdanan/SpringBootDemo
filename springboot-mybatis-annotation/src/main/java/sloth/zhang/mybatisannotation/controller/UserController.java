package sloth.zhang.mybatisannotation.controller;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 10:58 2019/8/5
 * @Modificd By;
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sloth.zhang.mybatisannotation.mapper.UserMapper;
import sloth.zhang.mybatisannotation.pojo.User;

import java.util.List;

@RestController
public class UserController {

    @SuppressWarnings("all")
    @Autowired
    UserMapper userMapper;

    @GetMapping("/list")
    public List<User> list() {
        return userMapper.list();
    }

    @GetMapping("/list/uid")
    public List<User> listById(@PathVariable("uid") Integer uid) {
        return userMapper.listById( uid );
    }

    @GetMapping("/get/{username}/{password}")
    public User get(@PathVariable("username") String username, @PathVariable("password") String password) {
        return userMapper.get(username, password);
    }

    @GetMapping("/get/bad/{username}/{password}")
    public User getBadUser(@PathVariable("username") String username, @PathVariable("password") String password) {
        return userMapper.getBadUser(username, password);
    }

}