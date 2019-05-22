package greenfoxacademy.example.hellobeanworld.models.colors;

import greenfoxacademy.example.hellobeanworld.services.MyColor;
import greenfoxacademy.example.hellobeanworld.services.Printer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("blue")
public class BlueColor implements MyColor {

  private final Printer printer;

  public BlueColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("I'm blue!");
  }
}
