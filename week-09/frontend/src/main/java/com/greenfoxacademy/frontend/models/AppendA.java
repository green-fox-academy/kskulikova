package com.greenfoxacademy.frontend.models;

public class AppendA extends Message {

  private String appended;


  public AppendA(String appendable) {

    this.appended = appendable + "a";
  }

  public String getAppended() {
    return appended;
  }
}
