package main.java.music;

class BassGuitar extends StringedInstrument {

  @Override
  String sound() {
    return "Duum-duum-duum";
  }


  BassGuitar() {
    numberOfStrings = 4;
  }

  BassGuitar(int i) {
    numberOfStrings = i;
  }
}
