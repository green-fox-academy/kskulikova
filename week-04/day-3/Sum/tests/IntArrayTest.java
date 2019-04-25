import static org.junit.Assert.*;

import org.junit.Test;

public class IntArrayTest {

  //  @Before
  IntArray list = new IntArray();
  IntArray list2 = new IntArray(0);

  @Test
  public void getSum() {

    list.add(3);
    list.add(4);
    list.add(5);

    assertEquals(12, list.getSum());
  }

  @Test
  public void getSumEmptyList() {
    assertEquals(0, list.getSum());
  }

  @Test
  public void getSumOne() {
    list.add(3);

    assertEquals(3, list.getSum());
  }

  @Test(expected = java.lang.NullPointerException.class)
  public void getSumNull() {

    list2.getSum();
  }

}