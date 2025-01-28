package com.usingconfigurations.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.usingconfigurations"})
@EnableAspectJAutoProxy
public class AppConfig {
}
