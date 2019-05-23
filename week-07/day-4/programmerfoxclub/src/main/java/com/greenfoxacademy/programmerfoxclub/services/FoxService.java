package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FoxService {

  private ArrayList<Fox> foxList;

  FoxService() {
    foxList = new ArrayList<>();
    foxList.add(new Fox("Fry"));
    foxList.add(new Fox("Leela"));
    foxList.add(new Fox("Bender"));
  }

  public List<Fox> getFoxList() {
    return foxList;
  }

  public Fox getFox(String name) {
    return foxList.stream().filter(f -> f.getName().equals(name)).findAny().orElse(null);
  }

  public boolean checkFox(String name) {

    return foxList.stream().anyMatch(f -> f.getName().equals(name));
  }

  public String getMessage(String name) {
    String message = "";
    if (!checkFox(name)) {
      message = "You have provided a name that has not been used before, add it as a new one!";
    }
    return message;
  }

  public void add(String name) {

    foxList.add(new Fox(name));

  }
}
