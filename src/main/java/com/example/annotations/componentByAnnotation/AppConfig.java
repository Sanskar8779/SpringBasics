package com.example.annotations.componentByAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.example.annotations.componentByAnnotation")
public class AppConfig {
}
