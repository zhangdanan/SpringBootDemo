package sloth.zhang.mybatiscommon.pojo;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 14:57 2019/8/5
 * @Modificd By;
 */

@Table(name = "mybatis_common_users")
public class User {
    @Id
    @Column(name = "ud")
    private Integer ud;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name = "mobileNum")
    private String mobileNum;

    @Transient
    private String other;

    public Integer getUd() {
        return ud;
    }

    public void setUd(Integer ud) {
        this.ud = ud;
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

    @Override
    public String toString() {
        return "User{" +
                "userId='" + ud + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", mobileNum='" + mobileNum + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}
