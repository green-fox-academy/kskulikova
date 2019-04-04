import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = scanner.nextInt();

        System.out.println("Enter a number: ");
        int b = scanner.nextInt();

        if(a > b) {
            System.out.println(a);
        } else if(a < b){
            System.out.println(b);
        } else {
            System.out.println("The numbers are even");
        }
    }
}
