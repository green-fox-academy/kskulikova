package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.services.FoxService;
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

  private FoxService foxservice;

  MainController(FoxService foxservice) {
    this.foxservice = foxservice;
  }

  @RequestMapping()
  public String staticFox(@RequestParam(value = "name", required = false) String name, Model model,  Fox fox) {
    foxservice.getFoxList();
    if (name == null) {
      return "login";
    } else if (foxservice.checkFox(name)) {
      model.addAttribute("fox", fox);
      return "index";
    }
    return "login";
  }

  @GetMapping("login")
  public String startLogin() {
    return "login";
  }

  @PostMapping("login")
  public String login(@RequestParam String name, RedirectAttributes redirectAttributes,
      Model model) {
    model.addAttribute("foxExists", foxservice.checkFox(name));
    model.addAttribute("message", foxservice.getMessage(name));
    redirectAttributes.addAttribute("fox", foxservice.getFox(name));
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
}
