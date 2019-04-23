
import java.util.ArrayList;
import java.util.List;

public class Garden {

  private List<Plants> garden = new ArrayList<>();


  private int needWater() {
    int number = 0;
    for (Plants plant : garden) {
      if (plant.isNeedsWater()) {
        number++;
      }
    }
    return number;
  }

  void getSomeWater(int waterAmount) {
    int needWater = needWater();
    System.out.println("Watering with " + waterAmount + " water");
    for (Plants plant : garden) {
      if (plant.isNeedsWater()) {
        plant.getSomeWater(waterAmount / needWater);
      }
    }
  }


  void add(Plants plant) {
    this.garden.add(plant);
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    for (Plants plants : garden) {
      result.append(plants.toString());
    }
    return result.toString();
  }

  void getState() {
    System.out.println(this.toString());
  }

  Garden() {
    List<Plants> garden = new ArrayList<>();
  }
}

