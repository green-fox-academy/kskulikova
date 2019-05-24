package com.greenfoxacademy.programmerfoxclub.models;

public enum Drink {
  WATER("Spring water"),
  LEMONADE("Lemonade"),
  KEFIR("Kefir"),
  MILK("Milk");

  private String name;

  Drink(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
