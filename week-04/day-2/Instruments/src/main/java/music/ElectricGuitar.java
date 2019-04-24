package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  @Override
  String sound() {
    return "Twang";
  }

  @Override
  public String getType() {
    return "Electric Guitar";
  }

  public ElectricGuitar() {
    numberOfStrings = 6;
  }

  public ElectricGuitar(int i) {
    numberOfStrings = i;
  }

}
