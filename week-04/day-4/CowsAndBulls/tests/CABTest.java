import static org.junit.Assert.*;

import org.junit.Test;

public class CABTest {

  private CAB cab = new CAB();
  private String guess;

  @Test
  public void constructor() {
    assertEquals("playing", cab.getState());
  }

  @Test
  public void guessStateShoulBeFinalised() {
    guess = String.valueOf(cab.getGoal());
    cab.guess(guess);
    assertEquals("finished", cab.getState());
  }

  @Test
  public void guessSuccess() {
    guess = String.valueOf(cab.getGoal());
    assertEquals("Success!", cab.guess(guess));
  }

  @Test
  public void countCowsAndBulls4Bulls() {
    cab.setGoal(4321);
    guess = "1234";

    assertEquals("4 bulls", cab.countCowsAndBulls(guess));
  }

  @Test
  public void countCowsAndBulls3Bulls1Cow() {
    cab.setGoal(7845);
    guess = "7584";

    assertEquals("1 cow, 3 bulls", cab.countCowsAndBulls(guess));
  }

  @Test
  public void countCowsAndBullsNoCowsNoBulls() {
    cab.setGoal(1234);
    guess = "5678";
    assertEquals("no cows, no bulls", cab.countCowsAndBulls(guess));
  }

  @Test
  public void countCowsAndBulls3Cows() {
    cab.setGoal(1245);
    guess = "1248";
    assertEquals("3 cows", cab.countCowsAndBulls(guess));
  }

  @Test
  public void countCowsAndBullsRepeatingNumbersInGuess() {
    cab.setGoal(1245);
    guess = "1222";
    assertEquals("2 cows", cab.countCowsAndBulls(guess));
  }

  @Test
  public void countCowsAndBullsRepeatingNumbersInGoal() {
    cab.setGoal(1222);
    guess = "2222";
    assertEquals("3 cows", cab.countCowsAndBulls(guess));
  }

  @Test
  public void countCowsAndBullsRepeatingNumbersInGoalAndInGuess() {
    cab.setGoal(1221);
    guess = "2121";
    assertEquals("2 cows, 2 bulls", cab.countCowsAndBulls(guess));
  }

  @Test
  public void countCowsAndBullsZeroInGuess() {
    cab.setGoal(1221);
    guess = "2012";
    assertEquals("3 bulls", cab.countCowsAndBulls(guess));
  }

  @Test
  public void countCowsAndBullsFirstNumbesrZeroInGues() {
    cab.setGoal(1221);
    guess = "0212";
    assertEquals("1 cow, 2 bulls", cab.countCowsAndBulls(guess));
  }

  @Test
  public void countCowsAndBullsOneCow() {
    cab.setGoal(1221);
    guess = "1000";
    assertEquals("1 cow", cab.countCowsAndBulls(guess));
  }
}