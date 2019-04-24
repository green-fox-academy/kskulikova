package main.java.music;

public class BassGuitar extends StringedInstrument {

  @Override
  String sound() {
    return "Duum-duum-duum";
  }

  @Override
  public String getType() {
    return "Bass Guitar";
  }


  public BassGuitar() {
    numberOfStrings = 4;
  }

  public BassGuitar(int i) {
    numberOfStrings = i;
  }
}
