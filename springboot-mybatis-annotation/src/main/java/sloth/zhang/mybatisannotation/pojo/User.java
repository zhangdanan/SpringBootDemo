package sloth.zhang.mybatisannotation.pojo;

import lombok.Data;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 10:22 2019/8/5
 * @Modificd By;
 */
@Data
public class User {
    private String uid;
    private String username;
    private String password;
    private String mobileNum;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }
}
