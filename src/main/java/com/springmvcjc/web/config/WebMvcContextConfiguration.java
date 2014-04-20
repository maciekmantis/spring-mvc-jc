package com.springmvcjc.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.springmvcjc.web.controller", "com.springmvcjc.web.listener"})
public class WebMvcContextConfiguration {
}
