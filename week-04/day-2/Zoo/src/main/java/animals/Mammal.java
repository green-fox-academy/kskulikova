package main.java.animals;

public class Mammal extends Animal {

  private String furColor;

  public void setFurColor(String furColor) {
    this.furColor = furColor;
  }

  public Mammal(String name) {
    super(name);
  }

  @Override
  public String breed() {

    return "pushing miniature versions out.";
  }

  @Override
  public void speak() {
    System.out.println("I'm making " + this.getName() + " sounds");
  }

  public String getFurColor() {
    return this.furColor;
  }

}
