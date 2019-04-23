
public class Flower extends Plants {

  private static final double percentage = 0.75;

  @Override
  public void getSomeWater(int waterAmount) {
    this.setWaterAmount(this.getWaterAmount() + (int) (percentage * waterAmount));
  }

  @Override
  public boolean isNeedsWater() {
    return this.getWaterAmount() < 5;
  }

  Flower(String color) {
    super(color);
  }
}
