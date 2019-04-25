import java.util.ArrayList;

public class IntArray {

  private ArrayList<Integer> integerList;
  private int sum;

  IntArray() {

    integerList = new ArrayList<>();

  }

  IntArray(int sum){
    this.sum = 0;
  }

  public void add(Integer i) {
    integerList.add(i);
  }


  int getSum() {
    for (Integer i : integerList) {

      sum += i;
    }
    return sum;
  }

  public static void main(String[] args) {
    IntArray test = new IntArray();
    System.out.println(test.integerList);
  }

}

