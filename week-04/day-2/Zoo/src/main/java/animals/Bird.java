package main.java.animals;

import day2.Flyable;

public class Bird extends Animal implements Flyable {

  int wingSpread;

  public Bird(String name) {
    super(name);
  }

  @Override
  public String breed() {
    return "laying eggs.";
  }

  @Override
  public void speak() {
    System.out.println("I'm chirping");
  }

  public void makeNest() {
    System.out.println("Look at me, I'm making a nest!");
  }

  public int getWingSpread() {
    return this.wingSpread;
  }

  public void setWingSpread(int wingSpread) {
    this.wingSpread = wingSpread;
  }

  @Override
  public void fly() {

  }

  @Override
  public void land() {

  }

  @Override
  public void takeOff() {

  }
}
