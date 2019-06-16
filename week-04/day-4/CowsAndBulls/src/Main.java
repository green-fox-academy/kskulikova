import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    System.out.println("How many attempts do you want to have?");


    System.out.println("Guess a 4-digit number: ");

    CAB game = new CAB();
    String result;
    Scanner scanner = new Scanner(System.in);

    do {
      String guess = scanner.next();
      result = game.guess(guess);
      System.out.println(result);
    } while (!result.equals("Success!"));

  }

}
