package sloth.zhang.mybatis.Mapper;


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import sloth.zhang.mybatis.domain.User;

import java.util.List;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 14:55 2019/7/31
 * @Modificd By;
 */


@Repository
@Mapper
public interface UserMapper {

    @Select("select * from mybatis_users where 1=1")
    List<User> list();

    @Select("select * from mybatis_users where username like #{username}")
    List<User> findByUsername(String username);

    @Select("select * from mybatis_users where user_id like #{userId}")
    User getOne(String userId);

    @Delete("delete from mybatis_users where user_id like #{userId}")
    int delete(String userId);

}
