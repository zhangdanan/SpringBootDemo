package sloth.zhang.redis.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 22:34 2020/5/21
 * @Modificd By;
 */
@Data
public class User implements Serializable {

    private Integer id;
    private String userName;
    private String userSex;
    public User() { }
    public User(Integer id, String userName, String userSex) {
        this.id = id;
        this.userName = userName;
        this.userSex = userSex;
    }
}
