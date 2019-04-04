import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for two integers
        System.out.println("Chikens on the farm: ");
        int chickens = scanner.nextInt();

        System.out.println("Pigs on the farm: ");
        int pigs = scanner.nextInt();

        int legs =  chickens * 2 + pigs * 4;
        System.out.println("That's " + legs + " animal legs on your farm!");

    }
}
