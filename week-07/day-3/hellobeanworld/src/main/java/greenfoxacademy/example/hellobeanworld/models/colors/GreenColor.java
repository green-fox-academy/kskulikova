package greenfoxacademy.example.hellobeanworld.models.colors;

import greenfoxacademy.example.hellobeanworld.services.MyColor;
import greenfoxacademy.example.hellobeanworld.services.Printer;
import org.springframework.stereotype.Service;

@Service
public class GreenColor implements MyColor {

  private final Printer printer;

  public GreenColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("I'm green!");
  }
}
