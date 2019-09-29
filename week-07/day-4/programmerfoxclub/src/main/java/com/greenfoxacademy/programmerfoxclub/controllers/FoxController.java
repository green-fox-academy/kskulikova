package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.services.FoxServiceable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class FoxController {

  private FoxServiceable foxService;

  FoxController(FoxServiceable foxService) {
    this.foxService = foxService;

  }

  @PostMapping("nutritionStore")
  public String nutritionStore(@RequestParam String name, String food, String drink) {
    Fox fox = foxService.getFox(name);
    fox.setFood(food);
    fox.setDrink(drink);
    foxService.addOrUpdate(fox);

    return "redirect:/?name=" + name;
  }

  @PostMapping("trickCenter")
  public String trickCenter(@RequestParam String name, String trick) {
    Fox fox = foxService.getFox(name);
    fox.addTrick(trick);
    foxService.addOrUpdate(fox);

    return "redirect:/?name=" + name;
  }
}
