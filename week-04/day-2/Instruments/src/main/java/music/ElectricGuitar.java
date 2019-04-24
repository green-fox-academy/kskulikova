package main.java.music;

class ElectricGuitar extends StringedInstrument {

  @Override
  String sound() {
    return "Twang";
  }

  ElectricGuitar() {
    numberOfStrings = 6;
  }

  ElectricGuitar(int i) {
    numberOfStrings = i;
  }

}
