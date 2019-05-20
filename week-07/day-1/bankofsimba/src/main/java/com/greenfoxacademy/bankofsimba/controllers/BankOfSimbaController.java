package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.Bank;
import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BankOfSimbaController {

  BankAccount account = new BankAccount("Simba", 2000, "lion");
  Bank bank = new Bank();

  @GetMapping(value = "/show")
  public String showAccount(Model model) {
    model.addAttribute("account", account);
    return "index";
  }

  @GetMapping(value = "/message")
  public String showMessage(Model model) {
    model.addAttribute("formatted1", "<em>HTML</em>");
    model.addAttribute("formatted2", "<b>Enjoy yourself!</b>");
    return "message";
  }

  @GetMapping(value = "/show/all")
  public String accountsList(Model model) {
    return "table";
  }

  @ModelAttribute
  public void addCurrency(Model model) {
    model.addAttribute("list", bank);
    model.addAttribute("currency", "Zebra");
    model.addAttribute("weight", "bold");
  }

  @PostMapping(value = "/increase")
  public String TopUp(String name) {
    for (BankAccount account : bank.getList()) {
      if (account.getName().equals(name)) {
        account.topUp();
      }
    }
    return "table";
  }

}

