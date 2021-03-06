package day2;

public class Student extends Person {

  private String previousOrganization;
  private int skippedDays;


  Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;

  }

  @Override
  void introduce() {
    System.out.println(
        "Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender()
            + " from " + previousOrganization +
            " who skipped " + skippedDays + " days from the course already.");
  }

  @Override
  void getGoal() {
    System.out.println("My goal is: Be a junior software developer.");
  }

  void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }

  @Override
  public Student clone() {
    return this;
  }


}
