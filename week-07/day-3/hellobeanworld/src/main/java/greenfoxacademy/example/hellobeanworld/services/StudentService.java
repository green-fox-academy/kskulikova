package greenfoxacademy.example.hellobeanworld.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements GreenFoxServiceable {

  private ArrayList<String> names;

  public StudentService() {
    names = new ArrayList<>();
    names.add("Sanyi");
    names.add("Lilla");
    names.add("John");
  }

  public List<String> findAll() {
    return names;
  }

  public int count() {
    return names.size();
  }

  public void save(String student) {
    names.add(student);
  }

  public String check(String student) {
    String s = "";
    if (student != null) {
      if (names.contains(student)) {
        s = "Is already enrolled";
      } else {
        s = "Not yet enrolled";
      }
    }
    return s;
  }
}
