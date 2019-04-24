package main.java.animals;//it has name, age field
//it has getName() and breed() methods

public abstract class Animal {

  private String name;
  private int age;
  private String gender;

  public String getName() {
    return this.name;
  }

  abstract String breed();

  abstract void speak();

  Animal(String name) {
    this.name = name;
  }


}
