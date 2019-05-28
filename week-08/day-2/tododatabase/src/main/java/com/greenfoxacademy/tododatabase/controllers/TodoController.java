package com.greenfoxacademy.tododatabase.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoController() {

  }

  @RequestMapping({"/", "/list"})
  @ResponseBody
  public String list() {
    return "This is my first Todo";
  }
}
