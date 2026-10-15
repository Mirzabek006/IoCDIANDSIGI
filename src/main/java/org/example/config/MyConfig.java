package org.example.config;

import org.example.MyBean;
import org.example.MyBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public MyBean myBean(){
        return new MyBean();
    }
    public MyBean2 myBean2(MyBean myBean){
        return new MyBean2(myBean);
    }
}
