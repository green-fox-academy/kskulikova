package com.greenfoxacademy.frontend.models;

public class Error extends Message {

  private String error;

  public Error(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }
}
