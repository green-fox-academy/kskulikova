public class Main {

  public static void main(String[] args) throws Throwable {
    Carrier myCarrier = new Carrier(10, 5);
    Carrier enemyCarrier = new Carrier(10, 3);

    F35 first = new F35();
    F35 second = new F35();
    F16 third = new F16();

    first.refill(100);
    second.refill(4);
    third.refill(5);

    myCarrier.add(first);
    myCarrier.add(second);

    first.fight();

    for (int i = 0; i < 5; i++) {
      enemyCarrier.add(new F35());
    }
    enemyCarrier.add(third);

    System.out.println(enemyCarrier.getStatus());

    enemyCarrier.fill();

    System.out.println(enemyCarrier.getStatus());

    myCarrier.fight(enemyCarrier);

    System.out.println(myCarrier.getStatus());
    System.out.println(enemyCarrier.getStatus());
  }
}
