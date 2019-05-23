package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class MainController {

  private FoxService foxservice;

  MainController(FoxService foxservice) {
    this.foxservice = foxservice;
  }

  @RequestMapping()
  public String staticFox(@RequestParam(value = "name", required = false) String name,
      Model model) {
    foxservice.getFoxList();
    if (name == null) {
      return "login";
    } else if (foxservice.checkFox(name)) {
      model.addAttribute("fox", foxservice.getFox(name));
      return "index";
    }
    return "login";
  }

  @GetMapping("login")
  public String startLogin() {
    return "login";
  }

  @PostMapping("login")
  public String login(@RequestParam String name, Model model) {
    model.addAttribute("foxExists", foxservice.checkFox(name));
    model.addAttribute("message", foxservice.getMessage(name));
    model.addAttribute("name", name);
    if (foxservice.checkFox(name)) {
      return "redirect:/?name=" + name;
    } else {
      return "login";
    }
  }

  @GetMapping("add")
  public String add() {
    return "add";
  }

  @PostMapping("add")
  public String addFox(@RequestParam String name) {
    foxservice.add(name);
    return "redirect:/?name=" + name;
  }

  @GetMapping("nutritionStore")
  public String nutritionStore(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    return "store";
  }
}

