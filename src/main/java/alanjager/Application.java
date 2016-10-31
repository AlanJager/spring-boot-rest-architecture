package alanjager;

/**
 * Created by AlanJager on 2016/10/19.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "alanjager")
@ServletComponentScan(basePackages = "alanjager.common.filter")
@EntityScan(basePackages = "alanjager.pojo")
@EnableJpaRepositories(basePackages = "alanjager.repository")
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}