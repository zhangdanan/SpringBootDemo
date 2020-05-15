package sloth.zhang.springdatajpa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sloth.zhang.springdatajpa.dao.UsersRepository;
import sloth.zhang.springdatajpa.domain.Users;


import javax.annotation.Resource;
import java.util.List;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 20:58 2020/5/15
 * @Modificd By;
 */

@RestController
public class UsersController {
    @Autowired
    UsersRepository usersRepository;

    @GetMapping("/user/list")
    public List<Users> list(){
        return usersRepository.findAll();
    }


    @GetMapping("/user/{id}")
    public Users getUser(@PathVariable("id") int id){
        Users users=usersRepository.findAll().get(0);
        return users;
    }


    @RequestMapping("/user/delete/{id}")
    public List<Users> delete(@PathVariable("id") int id){
        usersRepository.deleteById(id);
        return usersRepository.findAll();
    }

    @RequestMapping("/user/update")
    public Users update(Users users){
        Users update=usersRepository.save(users);
        return update;
    }

    @RequestMapping("/user/save")
    public Users insertUser(Users users){
        Users save=usersRepository.save(users);
        return save;
    }




}
