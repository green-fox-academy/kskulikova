//is able to hold unlimited amount of flowers or trees
//when watering it should only water those what needs water with equally divided amount amongst them
//eg. watering with 40 and 4 of them need water then each gets watered with 10

import java.util.ArrayList;
import java.util.List;

public class Garden {

  List<Plants> garden = new ArrayList<>();
  int needWater;


  public int needWater() {
    int number = 0;
    for (Plants plant : garden) {
      if (plant.isNeedsWater()) {
        number++;
      }
    }
    return number;
  }

  public void getSomeWater(int waterAmount) {
    this.needWater = needWater();
    System.out.println("Watering with " + waterAmount + " water");
    for (Plants plant : garden) {
      if (plant.isNeedsWater()) {
        plant.getSomeWater(waterAmount / needWater);
      }
    }
  }


  public void add(Plants plant) {
    this.garden.add(plant);
  }

  @Override
  public String toString() {
    String result = "";
    for (int i = 0; i < garden.size(); i++) {
      result += garden.get(i).toString();
    }
    return result;
  }

  public void getState() {
    System.out.println(this.toString());
  }


  Garden() {
    List<Plants> garden = new ArrayList<>();
  }
}

