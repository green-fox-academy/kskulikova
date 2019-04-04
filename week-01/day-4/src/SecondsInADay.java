public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int secondsInADay = 24 * (int)Math.pow(60,2);
        int currentCurrentSeconds = currentSeconds + currentMinutes * 60 + currentHours * (int)Math.pow(60,2);
        int remainingSeconds = secondsInADay - currentCurrentSeconds;

//        System.out.println(secondsInADay);
//        System.out.println(currentCurrentSeconds);
        System.out.println(remainingSeconds);
    }
}
