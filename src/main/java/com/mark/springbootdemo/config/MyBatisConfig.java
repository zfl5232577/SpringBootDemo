package com.mark.springbootdemo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis基础配置
 */
@Configuration
@MapperScan("com.mark.springbootdemo.dao")
public class MyBatisConfig {
}
