package com.greenfoxacademy.frontend.models;

public class Doubling extends Message {

  private int received;
  private int result;

  public Doubling(int input) {
    received = input;
    result = input * 2;
  }

  public int getReceived() {
    return received;
  }

  public int getResult() {
    return result;
  }

}
