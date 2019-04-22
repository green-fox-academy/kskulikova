public class Mentor {

  private String name;
  private int age;
  private String gender;
  private String level;

  Mentor() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    level = "intermediate";
  }

  Mentor(String name, int age, String gender, String level) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = level;

  }

  void introduce() {
    System.out.println(
        "Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + " mentor.");
  }

  void getGoal() {
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }

}
