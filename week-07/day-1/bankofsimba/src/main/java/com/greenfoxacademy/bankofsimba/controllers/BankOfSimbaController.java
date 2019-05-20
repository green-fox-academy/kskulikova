package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class BankOfSimbaController {

  BankAccount account = new BankAccount("Simba", 2000, "lion");
  List<BankAccount> list = new ArrayList<>();

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
    list.add(new BankAccount("Scar", 5000, "lion"));
    list.add(new BankAccount("Mufasa", 5500, "lion"));
    list.add(new BankAccount("Timon", 500, "meerkat"));
    list.add(new BankAccount("Pumbaa", 900, " warthog"));
    model.addAttribute("list", list);
    return "table";
  }

  @ModelAttribute
  public void addCurrency(Model model) {
    model.addAttribute("currency", "Zebra");
  }

}

