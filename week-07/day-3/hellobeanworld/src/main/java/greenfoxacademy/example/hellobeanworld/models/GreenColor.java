package greenfoxacademy.example.hellobeanworld.models;

import greenfoxacademy.example.hellobeanworld.services.MyColor;
import greenfoxacademy.example.hellobeanworld.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreenColor implements MyColor {

  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log("I'm green!");
  }
}
