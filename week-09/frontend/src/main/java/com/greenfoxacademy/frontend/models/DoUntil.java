package com.greenfoxacademy.frontend.models;

public class DoUntil extends Message {

  private int result;

  public DoUntil(Integer until, String action) {
    if (action.equals("sum")) {
      this.result = getSumOfAll(until);
    }
    if (action.equals("factor")) {
      this.result = getFactorial(until);
    }
  }

  int getSumOfAll(int until) {
    int sum = 0;
    for (int i = until; i > 0; i--) {
      sum += i;
    }
    return sum;
  }

  int getFactorial(int until) {
    int fact = until;
    if (fact == 0) {
      return 1;
    } else {
      return (fact * getFactorial(fact - 1));
    }
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
