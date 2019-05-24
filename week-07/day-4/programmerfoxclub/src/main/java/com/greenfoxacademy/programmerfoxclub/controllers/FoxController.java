package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

  private FoxService foxService;

  FoxController(FoxService foxService) {
    this.foxService = foxService;
  }

  @PostMapping("nutritionStore")
  public String nutritionStore(@RequestParam String name, String food, String drink) {
    foxService.getFox(name).setFood(food);
    foxService.getFox(name).setDrink(drink);

    return "redirect:/?name=" + name;
  }

  @PostMapping("trickCenter")
  public String trickCenter(@RequestParam String name, String trick) {
    foxService.getFox(name).addTrick(trick);
    return "redirect:/?name=" + name;
  }


}
