import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {
// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
        double i = 0;
        int sum = 0;
        double average = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        while(i < 5){
            int number = scanner.nextInt();
            sum += number;
            i++;

        }
        average = sum / i;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);


    }

}
