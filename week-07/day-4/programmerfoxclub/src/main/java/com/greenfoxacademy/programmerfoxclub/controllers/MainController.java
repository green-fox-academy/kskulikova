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

  private FoxService foxService;

  MainController(FoxService foxservice) {
    this.foxService = foxservice;
  }

  @RequestMapping()
  public String staticFox(@RequestParam(value = "name", required = false) String name,
      Model model) {
    foxService.getFoxList();
    if (name == null) {
      return "login";
    } else if (foxService.checkFox(name)) {
      model.addAttribute("fox", foxService.getFox(name));
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
    model.addAttribute("foxExists", foxService.checkFox(name));
    model.addAttribute("message", foxService.getMessage(name));
    model.addAttribute("name", name);
    if (foxService.checkFox(name)) {
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
    foxService.add(name);
    return "redirect:/?name=" + name;
  }

  @GetMapping("nutritionStore")
  public String nutritionStore(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    model.addAttribute("food", foxService.getFood());
    model.addAttribute("drink", foxService.getDrink());
    model.addAttribute("currentFood", foxService.getFox(name).getFood());
    model.addAttribute("currentDrink", foxService.getFox(name).getDrink());
    return "store";
  }

  @GetMapping("trickCenter")
  public String trickCenter(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    model.addAttribute("tricks", foxService.getTricks());
    model.addAttribute("latestTrick", foxService.getFox(name).getLatestTrick());
    return "trickCenter";
  }
}

