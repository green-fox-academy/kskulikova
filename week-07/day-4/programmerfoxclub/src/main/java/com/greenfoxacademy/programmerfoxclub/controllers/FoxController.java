package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import com.greenfoxacademy.programmerfoxclub.services.FoxServiceable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

  private FoxServiceable foxServiceable;

  FoxController(FoxServiceable foxServiceable) {
    this.foxServiceable = foxServiceable;
  }

  @PostMapping("nutritionStore")
  public String nutritionStore(@RequestParam String name, String food, String drink) {
    Fox fox = foxServiceable.getFox(name);
    fox.setFood(food);
    fox.setDrink(drink);
    foxServiceable.addOrUpdate(fox);

    return "redirect:/?name=" + name;
  }

  @PostMapping("trickCenter")
  public String trickCenter(@RequestParam String name, String trick) {
    Fox fox = foxServiceable.getFox(name);
    fox.addTrick(trick);
    foxServiceable.addOrUpdate(fox);

    return "redirect:/?name=" + name;
  }
}
