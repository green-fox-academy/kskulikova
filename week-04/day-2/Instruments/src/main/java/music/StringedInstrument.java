package main.java.music;

abstract class StringedInstrument extends Instrument {

  int numberOfStrings;

  abstract String sound();

  @Override
  void play() {
    System.out.println(
        this.getClass().getName().substring(16) + ", a " + numberOfStrings
            + "-stringed instrument that goes "
            + this.sound());
  }

}

