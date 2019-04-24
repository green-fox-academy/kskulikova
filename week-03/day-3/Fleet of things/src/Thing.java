/**
 * Created by aze on 2017.03.29..
 */
public class Thing implements Comparable<Thing> {

  private String name;
  private boolean completed;

  Thing(String name) {
    this.name = name;
  }

  void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  @Override
  public int compareTo(Thing thing) {
    if (this.completed == thing.completed) {
      return this.name.compareTo(thing.name);
    } else {
      return -1;
    }
  }
}

