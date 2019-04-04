// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//

public class DrawChessTable {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++ ){
            if (i % 2 == 0) {
                for (int j = 0; j < 4; j++){
                    System.out.print("% ");
                }
                System.out.print("\n");
            } else {
                for (int j = 0; j < 4; j++){
                    System.out.print(" %");
                }
                System.out.print("\n");

            }
        }
    }
}
