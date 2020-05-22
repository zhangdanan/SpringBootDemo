package sloth.zhang.mybatispuls.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 13:05 2020/5/20
 * @Modificd By;
 */

@Configuration
@MapperScan("sloth.zhang.mybatisplus.mapper")
public class MybatisPlusConfig {
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
