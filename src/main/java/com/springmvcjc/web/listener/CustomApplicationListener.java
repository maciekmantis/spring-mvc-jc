package com.springmvcjc.web.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.RequestHandledEvent;

@Component
public class CustomApplicationListener implements ApplicationListener<RequestHandledEvent>{

    @Override
    public void onApplicationEvent(RequestHandledEvent requestHandledEvent) {
        System.out.println(requestHandledEvent.getShortDescription());
        System.out.println("CustomApplicationListener requestHandledEvent handled");
    }
}
