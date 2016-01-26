package com.e_commerce.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by admin on 22.01.2016.
 */
@Configuration
@ComponentScan(basePackages = "com.e_commerce.service.*")
public class ServiceConfig {
}
