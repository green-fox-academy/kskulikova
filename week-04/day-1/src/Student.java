public class Student {


  private String name;
  private int age;
  private String gender;
  private String previousOrganization;
  private int skippedDays;

  Student() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  Student(String name, int age, String gender, String previousOrganization) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;

  }

  void introduce() {
    System.out.println(
        "Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization +
            " who skipped " + skippedDays + " days from the course already.");
  }

  void getGoal() {
    System.out.println("My goal is: Be a junior software developer.");
  }

  void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }

}
