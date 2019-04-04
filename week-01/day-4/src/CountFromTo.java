// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get two numbers
        System.out.println("Give me a number: ");
        int a = scanner.nextInt();
        System.out.println("Give me another number: ");
        int b = scanner.nextInt();

        if (a > b){
            System.out.println("The second number should be bigger");
        } else {
            while (a <= b){
                System.out.println(a);
                a++;
            }
        }

    }
}
