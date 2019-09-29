// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

public class Matrix {

  public static void main(String[] args) {
//        int[][] twoDymArray;
//        twoDymArray = new int[4][4];
//
//        for (int i = 0; i < twoDymArray.length; i++) {
//            for (int j = 0; j < twoDymArray[i].length; j++) {
//                if (j == i) {
//                    twoDymArray[i][j] = 1;
//                } else {
//                    twoDymArray[i][j] = 0;
//                }
//            }
//        }
//
//        for (int i = 0; i < twoDymArray.length; i++) {
//            for (int j = 0; j < twoDymArray[i].length; j++) {
//                System.out.print(twoDymArray[i][j]);
//            }
//            System.out.println();
//        }
//    }
    int[][] matrix = new int[4][4];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = (j == i) ? 1 : 0;
      }
    }
    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix[i].length; j++){
        System.out.print(matrix[i][j]);
      }
      System.out.println();
    }
  }
}
