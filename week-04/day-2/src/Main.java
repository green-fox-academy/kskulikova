import day2.Gnirts;
import day2.Reservation;
import day2.Shifter;

public class Main {

  public static void main(String[] args) {
//    day2.Student john = new day2.Student("John", 20, "male", "BME");
//    day2.Student johnTheClone = john.clone();
//
//    johnTheClone.introduce();

    Gnirts test = new Gnirts("example");
    System.out.println(test.charAt(2));

    System.out.println(test.subSequence(0, 3));

    Shifter s = new Shifter("example", 2);

    System.out.println(s.charAt(0));

  }
}
