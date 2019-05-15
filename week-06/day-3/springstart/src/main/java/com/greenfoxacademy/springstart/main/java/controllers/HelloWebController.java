package com.greenfoxacademy.springstart.main.java.controllers;

import static com.sun.tools.doclint.Entity.times;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

  private static AtomicLong id = new AtomicLong();

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam String name) {
    model.addAttribute("name", name);
    model.addAttribute("times", id.incrementAndGet());
    return "greeting";
  }
}
