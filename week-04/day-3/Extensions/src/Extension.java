import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
class Extension {


  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    if (a > b) {
      return a;
    } else {
      if (c > b) {
        return c;
      }
      return b;
    }
  }

  int median(List<Integer> pool) {
    pool.sort(Comparator.naturalOrder());

    if (pool.size() % 2 != 0) {
      return pool.get((pool.size() - 1) / 2);
    } else {
      return ((pool.get((pool.size() / 2)) + pool.get(pool.size() / 2 - 1)) / 2);
    }

  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'á', 'e', 'é', 'i', 'í', 'o', 'ó', 'ö', 'ő', 'u', 'ú', 'ü', 'ű')
        .contains(c);
  }

  String translate(String hungarian) {
    StringBuilder teve = new StringBuilder();

    int length = hungarian.length();
    for (int i = 0; i < length; i++) {
      char c = hungarian.charAt(i);
      if (isVowel(c)) {
        teve.append(c).append("v").append(c);
      } else {
        teve.append(c);
      }
    }

    return teve.toString();
  }

}