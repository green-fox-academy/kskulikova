import static org.junit.Assert.*;

import org.junit.Test;

public class AppleTest {

  @Test
  public void getApple() {

    Apple apple = new Apple();
    assertEquals("apple", apple.getApple());
  }
}