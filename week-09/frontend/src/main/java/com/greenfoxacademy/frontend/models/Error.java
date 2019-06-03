package com.greenfoxacademy.frontend.models;

public class Error extends Message {

  private String text;

  public Error(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }
}
