import java.util.Scanner;

public class NumberAdder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int n = scanner.nextInt();

        System.out.println(adder(n));
    }

    public static int adder (int i){
        if (i == 0){
            return i;
        }
        i = i + adder(i - 1);
        return i;
    }

}
