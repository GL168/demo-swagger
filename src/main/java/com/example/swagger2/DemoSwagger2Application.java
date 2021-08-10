package com.example.swagger2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 访问路径：
 *   http://localhost:21700/swagger-ui.html
 *   http://localhost:21700/doc.html   bootstrap界面
 * @author gulin
 * @date 14:18 2021/8/10
 **/
@SpringBootApplication
public class DemoSwagger2Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoSwagger2Application.class, args);
    }

}
