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

    private static String ticTacResult(String file) {
        String result = "";
        char[][] symbols = new char[3][3];

        try {
            Path src = Paths.get("assets/" + file);
            List<String> content = Files.readAllLines(src);
            for (int i = 0; i < content.size(); i++) {
                for (int j = 0; j < content.size(); j++) {
                    symbols[i][j] = content.get(i).charAt(j);
                }
            }
            int k = 0;
            if (symbols[k][0] == 'X' && symbols[k][1] == 'X' && symbols[k][2] == 'X') {
                result = "X";
            } else if (symbols[k][0] == 'O' && symbols[k][1] == 'O' && symbols[k][2] == 'O') {
                result = "O";
            } else if (symbols[0][k] == 'X' && symbols[1][k] == 'X' && symbols[2][k] == 'X') {
                result = "X";
            } else if (symbols[0][k] == 'O' && symbols[1][k] == 'O' && symbols[2][k] == 'O') {
                result = "O";
            } else if (symbols[0][k] == 'X' && symbols[1][k + 1] == 'X' && symbols[2][k + 2] == 'X') {
                result = "X";
            } else if (symbols[0][k] == 'O' && symbols[1][k + 1] == 'O' && symbols[2][k + 2] == 'O') {
                result = "O";
            } else {
                result = "DRAW";
            }

        } catch (IOException e) {
            System.out.println("Could not open file: " + file);
        }
        return result;
    }
}
