package com.example.swagger2.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger配置类
 * EnableSwagger2 Swagger的开关，表示已经启用Swagger
 * @author gulin
 * @date 2021/8/10 11:08
 */
@Configuration
@EnableSwagger2
public class Swagger2Config implements WebMvcConfigurer {

    @Bean
    public Docket createPcRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //分组
                //.groupName("web")
                .select()
                //.apis(RequestHandlerSelectors.basePackage("com.example.swagger2.controller.wen"))
                // 对所有api进行监控
                .apis(RequestHandlerSelectors.any())
                //.apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
                //.paths(PathSelectors.any())
                //错误路径不监控
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                // 对根下所有路径进行监控
                .paths(PathSelectors.regex("/.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("swagger RESTful APIs")
                .description("swagger RESTful APIs")
                .termsOfServiceUrl("https://github.com/GL168")
                .contact(new Contact("gulin", "https://github.com/GL168", "2171684711@qq.com"))
                .version("1.0")
                .build();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
