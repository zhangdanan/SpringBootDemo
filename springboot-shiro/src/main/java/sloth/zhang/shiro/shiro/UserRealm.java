package sloth.zhang.shiro.shiro;

import sloth.zhang.shiro.pojo.Permissions;
import sloth.zhang.shiro.pojo.Role;
import sloth.zhang.shiro.pojo.User;
import sloth.zhang.shiro.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行了=>授权doGetAuthorizationInfo");
        //获取登录用户名
        String name = (String) principalCollection.getPrimaryPrincipal();
        //根据用户名去数据库查询用户信息
//        User user = loginService.getUserByName(name);
        User user = new User();
        //添加角色和权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        for (Role role : user.getRoles()) {
            //添加角色
            simpleAuthorizationInfo.addRole(role.getRoleName());
            //添加权限
            for (Permissions permissions : role.getPermissions()) {
                simpleAuthorizationInfo.addStringPermission(permissions.getPermissionsName());
            }
        }
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行了=>认证doGetAuthorizationInfo");
        UsernamePasswordToken userToken = (UsernamePasswordToken)authenticationToken;
        User user = userService.queryUserByName(userToken.getUsername());
        if (user==null){ //UnknownAccountException
            return null;
        }

        //5.密码的比较
        Object principal = userToken.getUsername(); // principle认证的尸体信息(用户名)
        Object credentials = userToken.getCredentials();// 密码,由shiro比对
        AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(principal,user.getPassword(),getName());
        return authenticationInfo;
    }
}
