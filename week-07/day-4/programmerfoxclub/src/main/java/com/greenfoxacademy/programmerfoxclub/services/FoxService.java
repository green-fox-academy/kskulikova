package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Drink;
import com.greenfoxacademy.programmerfoxclub.models.Food;
import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.models.Tricks;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.stereotype.Service;


@Service
public class FoxService {

  private ArrayList<Fox> foxList;

  private List<String> tricks = Stream.of(Tricks.values())
      .map(Enum::name)
      .collect(Collectors.toList());

  private List<String> food = Stream.of(Food.values())
      .map(Enum::name)
      .collect(Collectors.toList());
  private List<String> drink = Stream.of(Drink.values())
      .map(Enum::name)
      .collect(Collectors.toList());


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

  public List<String> getTricks() {
    return tricks;
  }

  public List<String> getFood() {
    return food;
  }

  public List<String> getDrink() {
    return drink;
  }

}
