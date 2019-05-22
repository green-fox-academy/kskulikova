package greenfoxacademy.example.hellobeanworld.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("FileWriter")
public class StudentWritingService implements GreenFoxServiceable {

  private ArrayList<String> names;
  private String file = "./names.txt";

  public StudentWritingService() {
    names = new ArrayList<>();
    try {
      Path src = Paths.get(file);
      List<String> lines = Files.readAllLines(src);
      names.addAll(lines);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public List<String> findAll() {

    return names;
  }

  public int count() {
    return names.size();
  }

  public void save(String student) {
    names.add(student);
    try {
      Files.write(Paths.get(file), names);

    } catch (IOException e) {
      e.printStackTrace();
    }
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
