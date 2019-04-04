// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers? ");
        int howMany = scanner.nextInt();

        int sum = 0;
        System.out.println("Enter " + howMany + " integer numbers:");

        for (int i = 0; i < howMany; i++){
            int number = scanner.nextInt();
            sum += number;

        }
        double average = sum / howMany;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
