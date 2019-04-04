// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as the number was


import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many lines in a square? ");
        int lines = scanner.nextInt();



        for (int i = 0; i < lines; i++){
            if ((i == 0) || (i == lines - 1)){
                int j = 0;
                while (j < lines) {
                    System.out.print("%");
                    j++;
                }
            } else {
                System.out.print("%");
                int s = 0;
            while (s < lines - 2) {
                System.out.print(" ");
                s++;
            }
                System.out.print("%");
            }
            System.out.printf("\n");
        }
    }
}
