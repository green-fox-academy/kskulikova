package main.java.music;

abstract class StringedInstrument extends Instrument {

  int numberOfStrings;

  abstract String sound();

  @Override
  public void play() {
    System.out.println(
        this.getType() + ", a " + numberOfStrings
            + "-stringed instrument that goes "
            + this.sound());
  }

  public abstract String getType();


}

