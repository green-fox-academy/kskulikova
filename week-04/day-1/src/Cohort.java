import java.util.ArrayList;
import java.util.List;

class Cohort {

  String name;
  List<Student> students = new ArrayList<Student>();
  List<Mentor> mentors = new ArrayList<Mentor>();


  void addStudent(Student student) {
    students.add(student);
  }

  void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  void info() {
    System.out.println(
        "The " + name + " cohort has " + students.size() + " students and " + mentors.size()
            + " mentors.");
  }


  Cohort(String name) {
    this.name = name;
    List<Student> students = new ArrayList<Student>();
    List<Mentor> mentors = new ArrayList<Mentor>();

  }
}
