import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AnagramTest {

  Anagram test;

  @Test
  public void isAnagram() {
    test = new Anagram("dog", "god");
    boolean answer = true;
    assertEquals(answer, test.isAnagram());
  }


  @Test
  public void isAnagramNot() {
    test = new Anagram("doggggg", "god");
    boolean answer = false;
    assertEquals(answer, test.isAnagram());
  }

  @Test
  public void isAnagramEmptyString() {
    test = new Anagram("", "god");
    boolean answer = false;
    assertEquals(answer, test.isAnagram());
  }

  @Test
  public void isAnagramOneChar() {
    test = new Anagram("g", "g");
    boolean answer = true;
    assertEquals(answer, test.isAnagram());
  }

  @Test
  public void isAnagramEmptyStrings() {
    test = new Anagram("", "");
    boolean answer = true;
    assertEquals(answer, test.isAnagram());
  }

  @Test
  public void isAnagramMultipleOccurences() {
    test = new Anagram("dog", "goddog");
    boolean answer = false;
    assertEquals(answer, test.isAnagram());
  }
}