package com.example.demo;

import com.example.config.ManagementInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Order(1)
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Autowired private ManagementInfo managementInfo;

  @GetMapping("/info")
  public String getInfo() {
    return managementInfo.getInfo();
  }
}
