import static org.junit.Assert.*;

import org.junit.Test;

public class NumberConverterTest {
  NumberConverter test = new NumberConverter();

  @Test
  public void numberWordTestOnes() {
    assertEquals("eight", test.numberWord(8));
  }

  @Test
  public void numberWordTestTeens() {
    assertEquals("eighteen", test.numberWord(18));
  }
  @Test
  public void numberWordTestFiftyFour() {
    assertEquals("Fifty four", test.numberWord(54));
  }

  @Test
  public void numberWordTestOneHundredFiftyFour() {
    assertEquals("one hundred fifty four", test.numberWord(154));
  }

  @Test
  public void numberWordTestOneThousandOneHundredFiftyFour() {
    assertEquals("one thousand one hundred fifty four", test.numberWord(1154));
  }
}