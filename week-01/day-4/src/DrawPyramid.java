import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's draw a pyramid! How many lines?");
        int lines = scanner.nextInt();

        //first line - always one star;
        // every next one has two stars more
        //last line = lines * 2 - 1

        int maxStars = lines * 2 - 1;
        int spaces = maxStars / 2;

        // i is a counter for lines
        for (int i = 1; i <= lines; i++){
            // print spaces
            int s = 0;
            while (s < spaces) {
                System.out.print(" ");
                s++;
            }
            // print stars
            for (int j = 1; j <= (maxStars - spaces * 2); j ++) {
                System.out.print("*");
            }
            System.out.printf("\n");
            spaces--;
        }

    }
}


