package com.greenfoxacademy.programmerfoxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class MainController {

  @RequestMapping()
  public String staticFox(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    return "index";
  }

  @GetMapping("login")
  public String startLogin() {
    return "login";
  }

  @PostMapping("login")
  public String login(@RequestParam String name, RedirectAttributes redirectAttributes) {
    redirectAttributes.addAttribute("name", name);
    return "redirect:/";
  }

}
