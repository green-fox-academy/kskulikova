public class Fox {

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public int getAge() {
    return age;
  }

  private String name;
  private String color;
  private int age;

  Fox(String name, String color, int age) {
    this.age = age;
    this.color = color;
    this.name = name;
  }
}
