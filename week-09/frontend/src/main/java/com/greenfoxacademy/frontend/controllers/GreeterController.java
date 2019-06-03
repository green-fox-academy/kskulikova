package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Error;
import com.greenfoxacademy.frontend.models.Greeter;
import com.greenfoxacademy.frontend.models.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

  @RequestMapping("greeter")
  Message getGreeting(String name, String title) {
    if (name == null && title == null) {
      return new Error("Please provide a name and a title!");
    } else if (name == null) {
      return new Error("Please provide a name!");
    } else if (title == null) {
      return new Error("Please provide a title!");
    } else {
      return new Greeter(name, title);
    }
  }
}
