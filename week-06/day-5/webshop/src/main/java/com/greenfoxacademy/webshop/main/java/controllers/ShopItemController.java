package com.greenfoxacademy.webshop.main.java.controllers;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopItemController {

  static private List<ShopItem> itemList = new ArrayList<>();

  ShopItemController() {
    itemList.add(new ShopItem("T-shirt", "Best-quality white t-shirt", 30.00));
    itemList.add(new ShopItem("Vinyl", "The best of the best", 15.00));
    itemList.add(new ShopItem("Keychain", "Smiley face keychain", 2.50));
    itemList.add(new ShopItem("Nike trainers", "Running shoes unisex", 40.00));
    itemList.add(new ShopItem("Bible", "Edition for kids", 5.00));
    itemList.add(new ShopItem("Banana", "Fresh from the Caribbean", 0.15));
    itemList.add(new ShopItem("Lipstick", "Six-hour wear, "
        + "highly-pigmented lipstick", 15.00));
    itemList.add(new ShopItem("Chainsaw", "Bosch Universal Chain 18 Cordless Chainsaw", 25.00));
  }

  @RequestMapping(value = "/")
  public static String ShopItems(Model model) {
    model.addAttribute("items", itemList);
    return "shop";
  }

  @RequestMapping(value = "/only-available")
  public static String ShopItemsOnlyAvailable(Model model) {
    model.addAttribute("items",
        itemList.stream().filter(item -> item.getQuantityOfStock() > 0).collect(
            Collectors.toList()));
    return "shop";
  }

  @RequestMapping(value = "/cheapest-first")
  public static String ShopItemsCheapestFirst(Model model) {
    model.addAttribute("items", itemList.stream().sorted(Comparator.comparing(ShopItem::getPrice))
        .collect(Collectors.toList()));
    return "shop";
  }

  @RequestMapping(value = "/contains-nike")
  public static String ShopItemsContainsNike(Model model) {
    String string = "Nike";
    List<ShopItem> items = new ArrayList<>();
    itemList.stream()
        .filter(x -> x.getDescription().contains(string))
        .forEach(items::add);
    itemList.stream()
        .filter(x -> x.getName().contains(string))
        .forEach(items::add);
    model.addAttribute("items", items.stream().distinct().collect(Collectors.toList()));
    return "shop";
  }

  @RequestMapping(value = "/average-stock")
  public static String ShopItemsAverageStock(Model model) {
    model.addAttribute("average", itemList.stream()
        .mapToDouble(ShopItem::getQuantityOfStock)
        .average().orElse(0.0));
    return "shopQueryStock";
  }

  @RequestMapping(value = "/most-expensive-available")
  public static String ShopItemsMostExpensiveAvailable(Model model) {
    model.addAttribute("mostExpensive", itemList.stream().filter(item -> item.getQuantityOfStock() > 0)
        .max(Comparator.comparingInt(x -> (int) x.getPrice())).map(ShopItem::getName).orElse("None"));
    return "shopQueryPrice";
  }

}
