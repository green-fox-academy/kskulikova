
public class Domino implements Comparable<Domino> {

  private final int left;
  private final int right;

  Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  private int getLeftSide() {
    return left;
  }

  private int getRightSide() {
    return right;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }

  @Override
  public int compareTo(Domino domino) {
    if (this.getLeftSide() == domino.getLeftSide()) {
      if (this.getRightSide() > domino.getRightSide()) {
        return 1;
      } else if (this.getRightSide() < domino.getRightSide()) {
        return -1;
      }
      return 0;

    } else {
      if (this.getLeftSide() < domino.getLeftSide()) {
        return -1;
      }
    }
    return 1;
  }

}