package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankOfSimbaController {

  BankAccount account = new BankAccount("Simba", 2000, "lion");

  @GetMapping(value = "/show")
  public String showAccount(Model model) {
    model.addAttribute("account", account);
    return "index";
  }


}

