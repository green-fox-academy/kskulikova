// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was
import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's draw a diamond! How many lines?");
        int lines = scanner.nextInt();
        int spaces = lines/ 2;
        int stars = lines - spaces * 2;

        if (lines %2 != 0) {
            // i is a counter for lines
            for (int i = 1; i <= lines; i++) {
                // print spaces
                int s = 0;
                while (s < spaces) {
                    System.out.print(" ");
                    s++;
                }
                // print stars
                for (int j = 1; j <= stars; j++) {
                    System.out.print("*");
                }
                System.out.printf("\n");
                if (i <= lines / 2) {
                    spaces--;
                    stars +=2;
                } else {
                    spaces++;
                    stars -=2;
                }
            }
        } else {
            for (int i = 0; i <= lines; i++) {
                // print spaces
                int s = 0;
                while (s < spaces) {
                    System.out.print(" ");
                    s++;
                }
                // print stars
                for (int j = 1; j <= (stars - 2 + 1); j++) {
                    System.out.print("*");
                }
                System.out.printf("\n");
                if (i < lines / 2) {
                    spaces--;
                    stars += 2;
                } else if (i == lines /2){

                } else {
                    spaces++;
                    stars -=2;
                }
            }

        }
    }
}

