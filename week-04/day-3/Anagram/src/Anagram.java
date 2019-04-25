import java.util.Arrays;

class Anagram {

  private String s1;
  private String s2;

  Anagram(String s1, String s2) {
    this.s1 = s1;
    this.s2 = s2;
  }


  boolean isAnagram() {
    boolean match = false;
    if (s1.length() != s2.length()) {
      return match;

    } else {

      char[] s1Array = s1.toLowerCase().toCharArray();
      char[] s2Array = s2.toLowerCase().toCharArray();

      Arrays.sort(s1Array);
      Arrays.sort(s2Array);

      match = Arrays.equals(s1Array, s2Array);
    }
    return match;
  }
}

