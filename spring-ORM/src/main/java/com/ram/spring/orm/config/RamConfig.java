package com.ram.spring.orm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ram.spring.orm.model.entity.User;

@Configuration
@ComponentScan(basePackages = "com.ram.spring.orm.model.entity")
public class RamConfig {
	
		
}
