import main.java.animals.*;

public class Zoo {

  public static void main(String[] args) {

    Reptile reptile = new Reptile("Crocodile");
    Mammal mammal = new Mammal("Koala");
    Bird bird = new Bird("Parrot");

    bird.setWingSpread(33);
    mammal.setFurColor("white");
    reptile.setScalesColor("orange");

    System.out.println("How do you breed?");
    System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
    System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
    System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());

    System.out.println("Hi, I'm a " + mammal.getName() + " and I'm " + mammal.getFurColor());
    mammal.speak();

    System.out
        .println("Hi, I'm a " + bird.getName() + " and my wing spread is " + bird.getWingSpread());
    bird.speak();

    System.out.println("Hi, I'm a " + reptile.getName() + " and I'm " + reptile.getScalesColor());
    reptile.speak();
  }
}