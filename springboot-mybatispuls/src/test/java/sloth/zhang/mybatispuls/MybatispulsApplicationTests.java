package sloth.zhang.mybatispuls;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sloth.zhang.mybatispuls.dao.UserMapper;
import sloth.zhang.mybatispuls.domain.User;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class MybatispulsApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }


    @Test
    public void testAdd() throws Exception{
        User entity = new User();
        entity.setName( "admin" );
        entity.setAge( 22 );
        entity.setEmail( "xxxx@qq.com ");
        entity.insert();
    }

    /**
     * 更新数据
     */
    @Test
    public void testUpdate() throws Exception{
        User entity = new User();
        entity.setId(1);
        entity.setName("test");
        entity.setEmail("123456");
        entity.setAge(11);
        entity.updateById();
    }

    /**
     * 删除数据
     */
    @Test
    public void testDelete() throws Exception{
        User entity = new User();
        entity.deleteById(1);
    }


    /**
     * 查询指定id数据
     */
    @Test
    public void testSelectById() throws Exception{
        User entity = new User();
        User user = entity.selectById(1);
        System.out.println(user);
    }

    /**
     * 查询所有数据
     */
    @Test
    public void testSelectAll() throws Exception{
        User entity = new User();
        List list = entity.selectList(null);
        System.out.println(list);
    }

    /**
     * 查询所有数据 - 分页
     */
    @Test
    public void testSelectAllPage() throws Exception{
        User entity = new User();
        Page <User> page = (Page <User>) entity.selectPage(new Page<User>(1, 10), null);
        System.out.println(page);
    }

}
