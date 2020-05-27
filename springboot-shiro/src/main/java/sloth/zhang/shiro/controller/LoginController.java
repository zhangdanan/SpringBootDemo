package sloth.zhang.shiro.controller;

import sloth.zhang.shiro.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class LoginController {

    @GetMapping("/add")
    public String login(User user) {
        return "add.html";
    }


}
