import static java.lang.String.valueOf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class CAB {

  private int goal;
  private String state;
  private int counter;

  int getGoal() {
    return goal;
  }

  void setGoal(int goal) {
    this.goal = goal;
  }

  String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public int getCounter() {
    return counter;
  }

  public void setCounter(int counter) {
    this.counter = counter;
  }

  CAB() {
    goal = getNumber();
    state = "playing";
    counter = 0;
  }

  public static void main(String[] args) {
    System.out.println("Guess a 4-digit number");

  }

  private static int getNumber() {

    Random r = new Random();

    return r.nextInt(9000) + 1000;
  }

  String guess(String guess) {
    if (guess.equals(String.valueOf(goal))) {
      state = "finished";
      return "Success!";
    } else {
      counter++;
      return countCowsAndBulls(guess);
    }
  }

  String countCowsAndBulls(String guess) {
    int cows = 0;
    int bulls = 0;

    String goalString = valueOf(goal);
//    String guessString = valueOf(guess);
    Map<Integer, Character> goalNumber = new HashMap<>();

    for (int i = 0; i < 4; i++) {
      goalNumber.put(i, goalString.charAt(i));
    }

    Map<Integer, Character> guessed = new HashMap<>();

    for (int i = 0; i < 4; i++) {
      if (guess.charAt(i) == goalString.charAt(i)) {
        cows++;
        guessed.put(i, guess.charAt(i));
      }
    }

    List<Integer> index = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      char c = guess.charAt(i);
      if (goalString.contains("" + c)) {
        if (!guessed.containsValue(c)) {
          bulls++;
        } else {
          if (Collections.frequency(goalNumber.values(), c) >
              (Collections.frequency(guessed.values(), c))) {
            for (Entry<Integer, Character> e : guessed.entrySet()) {

              if (e.getValue().equals(c)) {
                index.add(e.getKey());
              }
            }
            if (!index.contains(i)) {
              bulls++;
            }
          }
        }
      }
    }

    if (cows == 0 & bulls == 0) {
      return "no cows, no bulls";
    }
    return (
        (cows == 0 ? "" : cows + ((cows == 1) ? ((bulls == 0) ? " cow" : " cow, ")
            : ((bulls == 0) ? " cows" : " cows, ")))
            + ((bulls == 0) ? ""
            : bulls + ((bulls == 1) ? " bull "
                : " bulls")));
  }
}
