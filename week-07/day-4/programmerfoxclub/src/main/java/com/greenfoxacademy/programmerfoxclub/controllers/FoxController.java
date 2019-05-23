package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

  private FoxService foxService;

  FoxController(FoxService foxService) {
    this.foxService = foxService;
  }

  @PostMapping("nutritionStore")
  public String nutritionStore(@RequestParam String name, Model model, String food, String drinks) {
    foxService.getFox(name).setFood(food);
    foxService.getFox(name).setDrink(drinks);
    return "redirect:/?name=" + name;
  }


}
