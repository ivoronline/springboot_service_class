package com.ivoronline.springboot_service_class.controllers;

import com.ivoronline.springboot_service_class.services.MyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  MyService myService = new MyService();

  @ResponseBody
  @RequestMapping("/Hello")
  public String hello() {

    //CALL SERVICE
    String result = myService.hello();

    //RETURN RESULT
    return result;

  }

}
