package com.greenfoxacademy.springstart.main.java.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greetings {

  private static AtomicLong id = new AtomicLong();
  private String content;

  Greetings(String content) {

    this.content = content;
  }

  public AtomicLong getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
