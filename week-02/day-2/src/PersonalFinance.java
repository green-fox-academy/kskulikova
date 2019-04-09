import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


//How much did we spend?
//Which was our greatest expense?
//Which was our cheapest spending?
//What was the average amount of our spendings?

public class PersonalFinance {
    public static void main(String[] args) {

        List<Integer> myFinance = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));

        System.out.println("Please type:\nT - total spend\nG - the greatest spend\n" +
                "S - the smallest spend\nA - average spend\nPress Q to quit");

        Scanner scanner = new Scanner(System.in);

        String command;
        do{
            command = scanner.next().toLowerCase();
            output(command, myFinance);
        } while(!command.equals("q"));

    }

    public static void output(String command, List myFinance){

        if (command.equals("t")){
            int total = 0;
            for (int i = 0; i < myFinance.size(); i++){
                total += (int)myFinance.get(i);
            }
            System.out.println("Total: " + total);
        }

        if (command.equals("g")){
            int greatest = 0;
            for (int i = 0; i < myFinance.size() - 2; i++){
                 if ((int)myFinance.get(i) > (int)myFinance.get(i + 1)) {
                    greatest = (int)myFinance.get(i);
                }
            }
            System.out.println("Greatest spend: " + greatest);
        }

        if (command.equals("s")){
            int smallest = 0;
            for (int i = 0; i < myFinance.size() - 2; i++){
                if ((int)myFinance.get(i) < (int)myFinance.get(i + 1)) {
                    smallest = (int)myFinance.get(i);
                }
            }
            System.out.println("Greatest spend: " + smallest);
        }

        if (command.equals("a")){
            int total = 0;
            int average;
            for (int i = 0; i < myFinance.size(); i++){
                total += (int)myFinance.get(i);
            }
            average = total / myFinance.size();
            System.out.println("Average spend: " + average);
        }
    }
}
