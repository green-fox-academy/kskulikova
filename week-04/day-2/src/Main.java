public class Main {

  public static void main(String[] args) {
//    Student john = new Student("John", 20, "male", "BME");
//    Student johnTheClone = john.clone();

//    johnTheClone.introduce();

    Gnirts test = new Gnirts("example");
    System.out.println(test.charAt(2));

    System.out.println(test.subSequence(0, 3));

    Shifter s = new Shifter("example", 2);


    System.out.println(s.charAt(0));
  }
}
