package com.bb.mo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by l_yy on 2017/12/26.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ImportResource({"classpath*:spring-context.xml"})
public class Bootstrap  {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Bootstrap.class);
    }

}
