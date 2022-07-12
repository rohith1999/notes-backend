package com.mithran.notes.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import org.springframework.boot.context.properties.ConfigurationProperties;

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "app")
public class AppConfig {

	private String appUrl;
 
    public String getAppUrl() {
        return appUrl;
    }
}