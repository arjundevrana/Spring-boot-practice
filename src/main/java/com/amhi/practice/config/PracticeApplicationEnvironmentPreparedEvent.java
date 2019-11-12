package com.amhi.practice.config;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

import java.util.Properties;

public class PracticeApplicationEnvironmentPreparedEvent implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent applicationEnvironmentPreparedEvent) {
        //Properties properties = new Properties();
       // properties .setProperty("org.owasp.esapi.resources","/home/arjunsingh1/resource-esapi");
        //System.setProperties(properties);
    }
}
