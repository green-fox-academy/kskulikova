package com.greenfoxacademy.programmerfoxclub.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Fox {

  @Id
  private String name;
  private String food;
  private String drink;

  @ElementCollection
  private List<String> listOfTricks;
  private String newTrick;

  protected Fox() {

  }

  public Fox(String name) {
    this.name = name;
    listOfTricks = new ArrayList<>();
    this.food = "air";
    this.drink = "aether";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public List<String> getListOfTricks() {
    return listOfTricks;
  }

  public int coutTricks() {
    return listOfTricks.size();
  }

  public String getLatestTrick() {
    if (coutTricks() > 0) {
      return getListOfTricks().get(this.listOfTricks.size() - 1);
    } else {
      return "";
    }
  }

  public void addTrick(String trick) {
    if (!listOfTricks.contains(trick)) {
      listOfTricks.add(trick);
    }
  }

  public String getNewTrick() {
    return newTrick;
  }

  public void setNewTrick(String newTrick) {
    this.newTrick = newTrick;
  }
}
