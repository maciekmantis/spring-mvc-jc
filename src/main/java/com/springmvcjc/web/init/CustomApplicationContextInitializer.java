package com.springmvcjc.web.init;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class CustomApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        //Setting ie. active profile
        System.out.println(configurableApplicationContext.getDisplayName());
        System.out.println("CustomApplicationContextInitializer initialized");
    }
}
