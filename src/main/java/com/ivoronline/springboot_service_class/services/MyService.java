package com.ivoronline.springboot_service_class.services;

import org.springframework.stereotype.Service;

@Service
public class MyService {

  public String hello() {
    return "Hello from Service";
  }

}
