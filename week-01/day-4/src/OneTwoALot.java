import java.util.Scanner;

public class OneTwoALot {
// Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot

    public static void main(String[] args) {
        System.out.println("Number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 1){
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");

        } else{
            System.out.println("A lot");
        }
    }

}
