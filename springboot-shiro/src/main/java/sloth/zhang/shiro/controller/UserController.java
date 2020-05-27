package sloth.zhang.shiro.controller;

import sloth.zhang.shiro.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class UserController {

    @GetMapping("/login")
    public String login(User user) {
        //获取当前用户
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(
                user.getUserName(),
                user.getPassword()
        );
        try {
            //进行验证，这里可以捕获异常，然后返回对应信息
            subject.login(token);
//            subject.checkRole("admin");
//            subject.checkPermissions("query", "add");
        } catch (UnknownAccountException uae) {
            return "用户名不存在：" + token.getPrincipal();
        } catch (IncorrectCredentialsException ice) {
            return token.getPrincipal() + "密码错误!";
        } catch (LockedAccountException lae) {
            return token.getPrincipal() + "帐号被锁定";
        }
        catch (AuthenticationException ae) {
            return "其它异常";
        }
//        catch (AuthorizationException e) {
//            return "没有权限";
//        }
        return token.getPrincipal() + "登陆成功";
    }





    //注解验角色和权限
    @RequiresRoles("admin")
    @RequiresPermissions("add")
    @RequestMapping("/index")
    public String index() {
        return "index!";
    }

}
