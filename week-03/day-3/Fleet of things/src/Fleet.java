import java.util.ArrayList;
import java.util.List;

/**
 * Created by aze on 2017.03.29..
 */
public class Fleet {

 List<Thing> fleet;

  Fleet() {

    fleet = new ArrayList<>();
  }

  void add(Thing thing) {
    fleet.add(thing);
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < fleet.size(); i++) {
      result.append(i + 1).append(". ").append(fleet.get(i)).append("\n");
    }
    return result.toString();
  }
}
