import static java.lang.String.valueOf;

import java.util.Random;

public class CAB {

  int goal;
  String state;
  int counter;

  CAB() {
    goal = getNumber();
    state = "playing";
    counter = 0;
  }

  public static void main(String[] args) {
    System.out.println("Guess a 4-digit number");
    System.out.println(getNumber());
  }

  private static int getNumber() {

    Random r = new Random();

    return r.nextInt(9000) + 1000;
  }

  String guess(int guess) {
    if (guess == goal) {
      return "Succes!";
    } else {
      counter++;
      return countCowsandBulls(guess);
    }
  }

  String countCowsandBulls(int guess) {
    int cows = 0;
    int bulls = 0;

    String goalString = valueOf(goal);
    String guessString = valueOf(guess);

    for (int c = 0; c < 4; c++) {
      if (guessString.charAt(c) == goalString.charAt(c)) {
        cows++;
      } else if (goalString.contains("" + guessString.charAt(c))) {
        bulls++;
      }
    }

    if (cows == 0 & bulls == 0) {
      return "no cows, no bulls";
    }
    return ((cows == 0 ? "" : cows + ((cows == 1) ? " cow" : " cows, ")) + ((bulls == 0) ? ""
        : bulls + ((bulls == 1) ? " bull "
            : " bulls")));
  }
}
