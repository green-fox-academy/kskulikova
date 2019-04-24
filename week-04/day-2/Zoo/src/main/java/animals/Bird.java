package main.java.animals;

public class Bird extends Animal {

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
}
