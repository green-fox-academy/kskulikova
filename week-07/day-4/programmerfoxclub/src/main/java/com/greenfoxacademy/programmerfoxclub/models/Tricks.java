package com.greenfoxacademy.programmerfoxclub.models;

public enum Tricks {

  SING("Sing a folk song"),
  CODE("Code in Java"),
  SLEEPWALKING("Sleepwalking");

  private String name;

  Tricks(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}

