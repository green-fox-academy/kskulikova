import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiceSet {

  ArrayList<Integer> dice = new ArrayList<>();

  public List<Integer> roll() {
    for (int i = 0; i < 6; i++) {
      dice.add((int) (Math.random() * 6) + 1);
    }
    return dice;
  }

  public List<Integer> getCurrent() {
    return dice;
  }

  public int getCurrent(int i) {
    return dice.get(i);
  }

  public void reroll() {
    for (int i = 0; i < dice.size(); i++) {
      dice.set(i, (int) (Math.random() * 6) + 1);
    }
  }

  public void reroll(int k) {
    dice.set(k, (int) (Math.random() * 6) + 1);
  }

  public static void main(String[] args) {

    System.out.println(System.nanoTime());

    DiceSet diceSet = new DiceSet();
    diceSet.roll();

    DiceSet winning = new DiceSet();
    winning.dice = new ArrayList<>();

    for (int i = 0; i < 6; i++) {
      winning.dice.add(6);
    }
    while (!(diceSet.getCurrent().equals(winning.dice))) {
      diceSet.reroll();
    }

    System.out.println(diceSet.getCurrent());
    System.out.println(System.nanoTime());
  }
}
