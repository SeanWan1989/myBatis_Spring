package sample.mybatis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import sample.mybatis.service.BlogService;
import sample.mybatis.service.CityService;

/**
 * Created by wanlichao on 2016/10/26 0026.
 */
@Configuration
@EnableTransactionManagement
public class ServiceConfig {

    @Bean
    public CityService cityService() {
        return new CityService();
    }

    @Bean
    public BlogService blogService() {
        return new BlogService();
    }
}