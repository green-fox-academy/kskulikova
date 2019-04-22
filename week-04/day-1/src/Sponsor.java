public class Sponsor {

  private String name;
  private int age;
  private String gender;
  private String company;
  private int hiredStudents;

  Sponsor() {
    name = "Jane Doe";
    age = 30;
    gender = "female";
    company = "Google";
    hiredStudents = 0;
  }

  Sponsor(String name, int age, String gender, String company) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
    hiredStudents = 0;

  }

  void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents "
        + company + " and hired " + hiredStudents + "  students so far.");
  }

  void getGoal() {
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  void hire() {
    hiredStudents++;
  }
}
