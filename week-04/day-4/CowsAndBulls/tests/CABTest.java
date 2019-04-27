import static org.junit.Assert.*;

import org.junit.Test;

public class CABTest {

  private CAB cab = new CAB();
  private int guess;

  @Test
  public void constructor() {
    assertEquals("playing", cab.getState());
  }

  @Test
  public void guessStateShoulBeFinalised() {
    guess = cab.getGoal();
    cab.guess(guess);
    assertEquals("finished", cab.getState());
  }

  @Test
  public void guessSuccess() {
    guess = cab.getGoal();
    assertEquals("Success!", cab.guess(guess));
  }

  @Test
  public void countCowsAndBulls4Bulls() {
    cab.setGoal(4321);
    guess = 1234;

    assertEquals("4 bulls", cab.countCowsAndBulls(guess));

  }

  @Test
  public void countCowsAndBulls3Bulls1Cow() {
    cab.setGoal(7845);
    guess = 7584;

    assertEquals("1 cow, 3 bulls", cab.countCowsAndBulls(guess));

  }

  @Test
  public void countCowsAndBullsNoCowsNoBulls() {
    cab.setGoal(1234);
    int guess = 5678;
    assertEquals("no cows, no bulls", cab.countCowsAndBulls(guess));

  }

  @Test
  public void countCowsAndBulls3Cows() {
    cab.setGoal(1245);
    int guess = 1248;
    assertEquals("3 cows", cab.countCowsAndBulls(guess));

  }
}