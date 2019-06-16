package greenfoxacademy.example.hellobeanworld;

import greenfoxacademy.example.hellobeanworld.services.MyColor;
import greenfoxacademy.example.hellobeanworld.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {

  private final Printer printer;

  private final MyColor mycolor;

  public HellobeanworldApplication(Printer printer, @Qualifier("blue") MyColor mycolor) {
    this.printer = printer;
    this.mycolor = mycolor;
  }

  public static void main(String[] args) {
    SpringApplication.run(HellobeanworldApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    System.out.println("The application has started");
    printer.log("HELLO");
    mycolor.printColor();
    System.out.println("The application has ended");
  }
}
