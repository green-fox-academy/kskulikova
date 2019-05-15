package com.greenfoxacademy.springstart.main.java.controllers;

import java.awt.Color;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloToAllWorld {

  private static AtomicLong id = new AtomicLong();
  private Random r = new Random();

  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj",
      "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló",
      "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry",
      "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem",
      "Sawubona"};

  String[] colors = {"red", "blue", "green", "grey", "black", "magenta", "orange", "pink"};

  String[] fonts = {"Merriweather", "Mukta", "Helvetica"};

  @RequestMapping("/web/greetingAllLanguages")
  public String greeting(Model model, @RequestParam String name) {
    model.addAttribute("name", name);
    model.addAttribute("times", id.incrementAndGet());
    model.addAttribute("greeting", hellos[r.nextInt(50)]);
    model.addAttribute("color", colors[r.nextInt(8)]);
    model.addAttribute("font", fonts[r.nextInt(3)]);
    model.addAttribute("fontsize", r.nextInt(49) + 8);
    return "greeting";
  }

}

