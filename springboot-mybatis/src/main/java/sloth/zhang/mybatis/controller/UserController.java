package sloth.zhang.mybatis.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sloth.zhang.mybatis.domain.User;
import sloth.zhang.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 16:11 2019/7/31
 * @Modificd By;
 */

@RestController
public class UserController {
  @Autowired
    UserService userService;



  @GetMapping("/list")
  @ResponseBody
   public List<User> list(){
      return userService.list();
  }

  @GetMapping("list/{username}")
   public List<User> findByUsername(String username){
      return userService.findByUsername(username);
  }

  @GetMapping("get/{userId}")
  public User get(String userId){
      return userService.get(userId);
  }

  @DeleteMapping("delete/{userId}")
    public int delete(String userId){
      return userService.delete(userId);
  }

}
