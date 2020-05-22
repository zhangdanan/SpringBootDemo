package sloth.zhang.redis;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;
import sloth.zhang.redis.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
class RedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        //这里相当于redis对String类型的set操作
        redisTemplate.opsForValue().set("test","helloworld");
        //这里相当于redis对String类型的get操作
        String test = (String)redisTemplate.opsForValue().get("test");
        System.out.println(test);
    }

    @Test
    public void testObj() throws Exception {
        User user=new User(1, "java的架构师技术栈", "man");
        ValueOperations <String, User> operations=redisTemplate.opsForValue();
        operations.set("fdd2", user);
        boolean exists=redisTemplate.hasKey("fdd2");
        System.out.println("redis是否存在相应的key"+exists);
        User getUser = (User)redisTemplate.opsForValue().get("fdd2");
        System.out.println("从redis数据库获取的user:"+getUser.toString());
    }

}
