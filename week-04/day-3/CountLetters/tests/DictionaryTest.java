import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.HashMap;
import org.junit.Test;

public class DictionaryTest {

  private Dictionary dictionary = new Dictionary();
  private HashMap<Character, Integer> answer = new HashMap<>();


  @Test
  public void countLettersKeysAndValues() {

    answer.put('h', 1);
    answer.put('e', 1);
    answer.put('l', 2);
    answer.put('o', 1);

    assertThat(dictionary.countLetters("hello"), is(answer));

  }

  @Test
  public void countLettersSize() {

    assertThat(dictionary.countLetters("wow").size(), is(2));
  }

  @Test
  public void countLettersAllLettersSame() {

    assertThat(dictionary.countLetters("eeeeeeeee").size(), is(1));
  }


}