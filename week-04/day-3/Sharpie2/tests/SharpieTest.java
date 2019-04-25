import static org.junit.Assert.*;

import org.junit.Test;

public class SharpieTest {

  Sharpie sharpie = new Sharpie("red", 5.3f);

  @Test
  public void use() {
    sharpie.use();
    assertEquals(99f, sharpie.getInkAmount(), 0.001);
  }

  @Test
  public void getInkAmount() {

    assertEquals(100f, sharpie.getInkAmount(), 0.001);
  }

  @Test
  public void useUp() {
    sharpie.useUp();
    assertEquals(0, sharpie.getInkAmount(), 0.001);
  }
}