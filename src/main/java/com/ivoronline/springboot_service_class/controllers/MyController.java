package com.ivoronline.springboot_service_class.controllers;

import com.ivoronline.springboot_service_class.services.MyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  MyService myService = new MyService();

  @ResponseBody
  @RequestMapping("/hello")
  public String sayHello() {
    String result = myService.sayHello();
    return result;
  }

}
