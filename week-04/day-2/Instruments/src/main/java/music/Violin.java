package main.java.music;

class Violin extends StringedInstrument {

  @Override
  String sound() {
    return "Screech";
  }

  Violin() {
    numberOfStrings = 4;
  }

}
