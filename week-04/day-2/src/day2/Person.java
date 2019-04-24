package day2;

public class Person {

  private String name;
  private int age;
  private String gender;

  String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  String getGender() {
    return this.gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

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
