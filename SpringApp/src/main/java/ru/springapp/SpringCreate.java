package ru.springapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.springapp")
public class SpringCreate {
    @Bean
    public Guitar musicalInstrument (){
        return new Guitar();
    }
    @Bean
    public Student studentBean() {
        return new Student();
    }
}
