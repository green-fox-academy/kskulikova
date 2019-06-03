package com.greenfoxacademy.frontend.models;

import java.util.ArrayList;
import java.util.List;

public class Result {

  private int number;
  private List<Integer> list;

  Result() {
    list = new ArrayList<>();
  }

  public int getNumber() {
    return number;
  }

  public List<Integer> getList() {
    return list;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public void setList(List<Integer> list) {
    this.list = list;
  }

}
