public class Person {

  private String name;
  private int age;
  private String gender;

  Person() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
  }

  Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;

  }

  void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
  }

  void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }
}
