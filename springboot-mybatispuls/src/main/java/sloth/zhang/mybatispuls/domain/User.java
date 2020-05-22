package sloth.zhang.mybatispuls.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 13:06 2020/5/20
 * @Modificd By;
 */
@Data
@TableName("mybatisplus_users")
public class User extends Model<User> {

    @TableId(value = "id", type= IdType.AUTO)
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("age")
    private Integer age;

    @TableField("email")
    private String email;
}
