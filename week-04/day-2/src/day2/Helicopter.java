package day2;

public class Helicopter extends Vehicle implements Flyable {

  @Override
  public void fly() {
    System.out.println("I'm flying thanks to my helicopter rotor.");
  }

  @Override
  public void land() {
    System.out.println("All clear for landing!");
  }

  @Override
  public void takeOff() {
    System.out.println("Ready...go!");

  }
}
