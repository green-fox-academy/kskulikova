package com.greenfoxacademy.webshop.models;

import java.util.Random;

public class ShopItem {

  private String name;
  private double price;
  private String description;
  private int quantityOfStock;
  private Random r;

  ShopItem(String name, double price) {
    r = new Random();
    this.name = name;
    description = "";
    this.price = price;
    quantityOfStock = r.nextInt(5);
  }

  public ShopItem(String name, String description, double price) {
    r = new Random();
    this.name = name;
    this.description = description;
    this.price = price;
    quantityOfStock = r.nextInt(5);
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public String getDescription() {
    return description;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }

  public int addStock(int additionalQuantity) {
    return quantityOfStock;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
