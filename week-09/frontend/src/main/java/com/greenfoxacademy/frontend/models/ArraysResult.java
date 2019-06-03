package com.greenfoxacademy.frontend.models;

import java.util.ArrayList;
import java.util.List;

public class ArraysResult extends Message {

  private Object result;

  public ArraysResult(String what, ArrayList<Integer> numbers) {
    if (what.equals("sum")) {
      this.result = getSum(numbers);
    }
    if (what.equals("multiply")) {
      this.result = getProduct(numbers);
    }
    if (what.equals("double")) {
      this.result = getDouble(numbers);
    }
  }

  public int getSum(ArrayList<Integer> numbers) {
    int result = 0;
    for (int n : numbers) {
      result += n;
    }
    return result;
  }

  public int getProduct(ArrayList<Integer> numbers) {
    int result = 1;
    for (int n : numbers) {
      result *= n;
    }
    return result;
  }

  public List<Integer> getDouble(ArrayList<Integer> numbers) {
    List<Integer> resultList = new ArrayList<>();
    for (int n : numbers) {
      resultList.add(n * 2);
    }
    return resultList;
  }

  public Object getResult() {
    return result;
  }

  public void setResult(List<Integer> result) {
    this.result = result;
  }

}
