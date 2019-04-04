import java.util.Scanner;

// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
public class Cuboid {
    public static void main(String[] args) {

        double width;
        double length;
        double height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Width: ");
        width = scanner.nextDouble();

        System.out.println("Length: ");
        length = scanner.nextDouble();

        System.out.println("Height: ");
        height = scanner.nextDouble();

        //Calculate the surface area

        double surfaceArea = 2 * width * length + 2 * width * height + 2 * height * length;
        System.out.println("Suface area: " + (int)surfaceArea);



        double volume = width * height * length;
        System.out.println("Volume: " + (int)volume);














    }
    }

// Surface Area: 600
// Volume: 1000



