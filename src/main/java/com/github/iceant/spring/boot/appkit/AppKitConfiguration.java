package com.github.iceant.spring.boot.appkit;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {AppKitConfiguration.class})
public class AppKitConfiguration {
}
