import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask for the name of the user
        System.out.println("Give me a name");

        String name = scanner.next();

        // Print out the greeting
        System.out.println("Hello, " + name + "!");
    }
}
