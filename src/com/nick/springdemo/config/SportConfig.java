package com.nick.springdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.nick.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

}
