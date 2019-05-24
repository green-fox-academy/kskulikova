package com.greenfoxacademy.programmerfoxclub.models;

public enum Food {
  PIZZA("Pizza"),
  RABBIT("Tasty rabbit"),
  FISH ("Fish"),
  GRASS ("Grass");

  private String name;

  Food (String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }

}
