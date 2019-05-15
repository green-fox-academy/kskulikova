package com.greenfoxacademy.springstart.main.java.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping("/greeting")

  public static Greetings greeting(@RequestParam String name) {
    Greetings greeting = new Greetings(123456, "Hello, " + name);
    return greeting;
  }
}
