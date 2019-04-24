package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Reservation implements Reservationy {

  @Override
  public String getDowBooking() {

    List<String> dows = new ArrayList<>();
    dows.add("MON");
    dows.add("TUE");
    dows.add("WED");
    dows.add("THU");
    dows.add("FRI");
    dows.add("SAT");
    dows.add("SUN");

    int rand = (int) (Math.random() * 6 + 1);
    return dows.get(rand);
  }

  //DOW is randomly ordered to the bookings from an array.
  @Override
  public String getCodeBooking() {
    List<Range> ranges = new ArrayList<>();
    ranges.add(new Range(48, 57));
    ranges.add(new Range(65, 90));
    List<Integer> randomNumbers = generateRandomNumbers(ranges, 8);

    StringBuilder code = new StringBuilder();
    for (int i : randomNumbers) {
      code.append((char) i);
    }
    return code.toString();
  }

  class Range {

    int min, max;

    Range(int min, int max) {
      this.min = min;
      this.max = max;
    }
  }

  private List<Integer> generateRandomNumbers(List<Range> ranges, int numberOfNumbers) {
    List<Integer> randomNumbers = new ArrayList<>(numberOfNumbers + 1);
    while (numberOfNumbers-- > 0) {
      Range range = ranges.get(new Random().nextInt(ranges.size()));
      randomNumbers.add(range.min + (int) (Math.random() * ((range.max - range.min) + 1)));

    }
    return randomNumbers;
  }

  public String getInfo() {
    String booking;
    booking = "Booking# " + getCodeBooking() + " for " + getDowBooking();
    return booking;
  }

  public static void main(String[] args) {
    Reservation reservation = new Reservation();

    System.out.println(reservation.getInfo());
    System.out.println(reservation.getInfo());
    System.out.println(reservation.getInfo());
    System.out.println(reservation.getInfo());
    System.out.println(reservation.getInfo());
    System.out.println(reservation.getInfo());
    System.out.println(reservation.getInfo());
  }

}