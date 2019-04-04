import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {


        // Ask for an integer that is a distance in kilometers,
        System.out.println("Distance in kilometers: ");

        Scanner scanner = new Scanner(System.in);
        // then it converts that value to miles and prints it
        int kilometers = scanner.nextInt();

        double ratio = 0.621371;
        double miles = kilometers * ratio;
        System.out.printf("Distance in miles %.3f %n" ,miles);
    }
}