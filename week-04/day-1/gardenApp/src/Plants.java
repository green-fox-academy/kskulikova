public class Plants {

  private int waterAmount;
  private boolean needsWater;

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
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

  public void setNeedsWater(boolean needsWater) {
    this.needsWater = needsWater;
  }

  public void getSomeWater(int waterAmount) {
    System.out.println("Watering with " + waterAmount + " water");
  }

  Plants(){
    needsWater = true;
    waterAmount = 0;
    color = "green";
  }

  @Override
  public String toString() {
    return ("The " + this.getColor() + this.getClass() + (isNeedsWater() ? " needs" : " doesn't need") + " water \n");
  }

  Plants(String color){
    needsWater = true;
    waterAmount = 0;
    this.color = color;
  }
}
