package sloth.zhang.mybatis.service;


import sloth.zhang.mybatis.domain.User;

import java.util.List;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 15:37 2019/7/31
 * @Modificd By;
 */
public interface UserService {

    List<User> list();

    List<User> findByUsername(String username);

    User get(String userId);

    int delete(String userId);



}
