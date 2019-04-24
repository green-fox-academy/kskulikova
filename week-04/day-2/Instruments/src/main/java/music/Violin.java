package main.java.music;

public class Violin extends StringedInstrument {

  @Override
  String sound() {
    return "Screech";
  }

  @Override
  public String getType() {
    return "Violin";
  }

  public Violin() {
    numberOfStrings = 4;
  }

}
