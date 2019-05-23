package com.greenfoxacademy.programmerfoxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

  @RequestMapping()
  public String staticFox() {
    return "index";
  }

  @RequestMapping("login")
  public String login() {
    return "login";
  }

}
