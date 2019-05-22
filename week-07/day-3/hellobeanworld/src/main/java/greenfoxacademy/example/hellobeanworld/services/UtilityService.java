package greenfoxacademy.example.hellobeanworld.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class UtilityService {

  private ArrayList<String> colors;
  private Random random;

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

  public boolean isEmailValid(String email) {
    return (email.contains("@") && email.contains("."));
  }

  public String caesar(String text, int number) {
    if (number < 0) {
      number = 26 + number;
    }
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < text.length(); i++) {
      int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
      result.append((char) (((int) text.charAt(i) + number - offset) % 26 + offset));
    }
    return result.toString();
  }

}