import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Give me a number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int length = String.valueOf(number).length();

        //if sum of each digit to the n-th power equals to the initial number, it's an Armstrong's number
        int i = number;

        double power;
        int answer = 0;

        while (i >= 1){
            int j = i % 10;
            i = i / 10;
            power = Math.pow(j, length);
            answer += power;
        }
        if (answer == number) {
            System.out.println("The " + number + " is an Armstrong number");
        } else {
            System.out.println("The " + number + " is not an Armstrong number");
        }
    }
}
