import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lowest number: ");
        int a = scanner.nextInt();

        System.out.println("Highest number: ");
        int z = scanner.nextInt();

        int range = z - a + 1;
        int random = new Random().nextInt(range) + a;

        System.out.println("I have a number " + a + " - " + z + ". You have 5 lives");
        guess(random);
    }

    static void guess(int i){
        Scanner scanner = new Scanner(System.in);
        int attempt;
        int lives = 5;
        do{
        attempt = scanner.nextInt();
            lives--;
        if(attempt < i){
            System.out.println("Too low. You have " + lives + " lives left");
        } else if (attempt > i) {
            System.out.println("Too high. You have " + lives + " lives left");
        }
        } while ((attempt != i) && (lives > 0));

        if (lives == 0){
            System.out.println("Oops...you lost!");
        } else {
            System.out.println("Congratulations! You won");
        }
    }
}
