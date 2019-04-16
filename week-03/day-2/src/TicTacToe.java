// Write a function that takes a filename as a parameter
// The file contains an ended Tic-Tac-Toe match
// We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
// Return "X", "O" or "Draw" based on the input file

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        String file = "draw.txt";
        ticTacResult(file);

        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }
    private static String ticTacResult(String file){
        String result = "";
        int x = 0;
        int o = 0;
        try {
            Path src = Paths.get("assets/" + file);
            List<String> content = Files.readAllLines(src);
            for (String line : content) {
                for (int i = 0; i < line.length(); i++) {
                    if(line.charAt(i) == 'X'){
                     x++;
                    }
                    if (line.charAt(i) == 'O'){
                        o++;
                    }
                }
            }
            if (x > o){
                result = "X";
            } else if ( o > x){
                result ="O";
            } else {
                result = "draw";
            }
        } catch (IOException e){
            System.out.println("Could not open file: " + file);
        }


    return result;
    }
}
