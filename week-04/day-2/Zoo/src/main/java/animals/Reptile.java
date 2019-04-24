package main.java.animals;

public class Reptile extends Animal {

  private String scalesColor;

  public Reptile(String name) {
    super(name);
  }

  public void setScalesColor(String scalesColor) {
    this.scalesColor = scalesColor;
  }

  @Override
  public String breed() {

    return "laying eggs.";
  }

  @Override
  public void speak() {
    System.out.println("I'm hissing");
  }

  public String getScalesColor() {
    return this.scalesColor;
  }
}
