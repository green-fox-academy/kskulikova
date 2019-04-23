public class Plants {

  private int waterAmount;
  private boolean needsWater;

  private String getColor() {
    return color;
  }

  private String color;


  int getWaterAmount() {
    return waterAmount;
  }

  void setWaterAmount(int waterAmount) {
    this.waterAmount = waterAmount;
  }

  public boolean isNeedsWater() {
    return needsWater;
  }


  public void getSomeWater(int waterAmount) {
    System.out.println("Watering with " + waterAmount + " water");
  }

  @Override
  public String toString() {
    return ("The " + this.getColor() + " " + this.getClass().getName() + (isNeedsWater() ? " needs"
        : " doesn't need") + " water \n");
  }

  Plants(String color) {
    needsWater = true;
    waterAmount = 0;
    this.color = color;
  }
}
