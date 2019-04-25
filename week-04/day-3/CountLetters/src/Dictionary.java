import java.util.HashMap;

class Dictionary {

  private HashMap<Character, Integer> dictionary;

  Dictionary() {

    dictionary = new HashMap<>();
  }

  HashMap<Character, Integer> countLetters(String s) {

    for (int i = 0; i < s.length(); i++) {
      if (dictionary.containsKey(s.charAt(i))) {
        dictionary.put(s.charAt(i), dictionary.get(s.charAt(i)) + 1);
      } else {
        dictionary.put(s.charAt(i), 1);
      }
    }
    return dictionary;
  }

  public static void main(String[] args) {

    Dictionary dictionary = new Dictionary();
    System.out.println(dictionary);
    System.out.println(dictionary.countLetters("hello"));
  }

  public int size(){
    return dictionary.size();
  }
}
