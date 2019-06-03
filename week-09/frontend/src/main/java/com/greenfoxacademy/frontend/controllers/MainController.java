package com.greenfoxacademy.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

  @RequestMapping("/")
  String renderMainPage() {
    return "index";
  }
}
