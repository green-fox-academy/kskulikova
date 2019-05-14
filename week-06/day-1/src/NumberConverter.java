
import java.util.ArrayList;
import java.util.List;

public class NumberConverter {

  public String numberWord(int i) {
    List<Integer> intList = new ArrayList<>();
    List<String> onesList = new ArrayList<>();
    List<String> teensList = new ArrayList<>();
    List<String> tensList = new ArrayList<>();

    String strNum = "";
    List<String> result = new ArrayList<>();
    List<Integer> groupInt = new ArrayList<>();

    onesList.add("one");
    onesList.add("two");
    onesList.add("three");
    onesList.add("four");
    onesList.add("five");
    onesList.add("six");
    onesList.add("seven");
    onesList.add("eight");
    onesList.add("nine");

    teensList.add("ten");
    teensList.add("eleven");
    teensList.add("twelve");
    teensList.add("thirteen");
    teensList.add("fourteen");
    teensList.add("fifteen");
    teensList.add("sixteen");
    teensList.add("seventeen");
    teensList.add("eighteen");
    teensList.add("nineteen");

    tensList.add("twenty");
    tensList.add("thirty");
    tensList.add("forty");
    tensList.add("fifty");
    tensList.add("sixty");
    tensList.add("seventy");
    tensList.add("eighty");
    tensList.add("ninety");

    int groups = 0;
    int iter = i;
    do {
      intList.add(iter % 10);
      iter = iter / 10;
      groups++;
    } while (iter != 0);

    groups = groups / 3 + 1;

    while(groups > 0){
      for(int x = 0; x < 3; x++) {
        groupInt.add(intList.get(x));
      }
      groups--;
    }

    while (groupInt.size() > 0) {
      switch (intList.size()) {
        case 1:
          result.add(onesList.get(i - 1));
          intList.remove(intList.get(intList.size() - 1));
          break;
        case 2:
          if (intList.get(1) == 1) {
            result.add(teensList.get(intList.get(0)));
            for (int k = 0; k < 2; k++) {
              intList.remove(intList.get(intList.size() - 1));
            }
          } else {
            result.add(tensList.get(intList.get(1) - 2));
            result.add(onesList.get(intList.get(0) - 1));
            for (int k = 0; k < 2; k++) {
              intList.remove(intList.get(intList.size() - 1));
            }
          }
        case 3:
          result.add(onesList.get(intList.get(2) - 1));
          result.add("hundred");
          if (intList.get(1) == 1) {
            result.add(teensList.get(intList.get(0)));
          } else {
            result.add(tensList.get(intList.get(1) - 2));
            result.add(onesList.get(intList.get(0) - 1));
          }
          for (int k = 0; k < 3; k++) {
            intList.remove(intList.get(intList.size() - 1));
          }
      }

      groups--;

    }
    return result.toString();
  }
}

