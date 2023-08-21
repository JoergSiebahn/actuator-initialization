package com.example.config;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@AutoConfiguration
@ComponentScan
@PropertySource("classpath:/com/example/config/management/defaults.properties")
public class ManagementConfig {}
