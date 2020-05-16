package sloth.zhang.mybatiscommon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sloth.zhang.mybatiscommon.pojo.User;
import sloth.zhang.mybatiscommon.service.UserService;

import java.util.List;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 15:23 2019/8/5
 * @Modificd By;
 */

@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("list")
    public List<User> list(User user){
        return userService.list(user);
    }


    @RequestMapping("get")
    public User get(User user){
        return userService.get(user);
    }

    @RequestMapping("update")
    public int update(User user){
       return userService.update(user);
    }

    @RequestMapping("save")
    public int save(User user){
        return userService.save(user);
    }

    @RequestMapping("delete")
    public int delete(User user){
        return userService.delete(user);
    }
}
