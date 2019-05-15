package com.greenfoxacademy.springstart.main.java.controllers;

import org.springframework.web.bind.annotation.RequestParam;

public class Greetings {

  private long id;
  private String content;

  Greetings(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
