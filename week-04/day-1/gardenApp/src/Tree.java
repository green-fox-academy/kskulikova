
public class Tree extends Plants {

  private static final double percentage = 0.40;

  @Override
  public void getSomeWater(int waterAmount) {
    this.setWaterAmount(this.getWaterAmount() + (int) (percentage * waterAmount));
  }


  @Override
  public boolean isNeedsWater() {
    return this.getWaterAmount() < 10;
  }

  Tree(String color) {
    super(color);
  }
}
