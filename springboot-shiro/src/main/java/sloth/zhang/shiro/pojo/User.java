package sloth.zhang.shiro.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private int id;
    private String userName;
    private String password;
    /**
     * 用户对应的角色集合
     */
    private Set <Role> roles;
    //省略set、get方法等.....
}
