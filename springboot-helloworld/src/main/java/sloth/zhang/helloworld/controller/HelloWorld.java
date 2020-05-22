package sloth.zhang.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 19:32 2020/5/22
 * @Modificd By;
 */
@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String HelloWorld(){
        return "Hello World SpringBoot";
    }



}
