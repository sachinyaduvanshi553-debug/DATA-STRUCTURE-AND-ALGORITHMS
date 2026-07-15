public class NQUEENS4X4 {


    static int n = 4;


    // Function to print board
    static void printBoard(char[][] board) {

        System.out.println("Solution:");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }



    // Check if queen can be placed
    static boolean isSafe(char[][] board,
                          int row,
                          int col) {


        // Check column

        for (int i = 0; i < row; i++) {

            if (board[i][col] == 'Q')
                return false;
        }



        // Check upper left diagonal

        int i = row - 1;
        int j = col - 1;


        while (i >= 0 && j >= 0) {

            if (board[i][j] == 'Q')
                return false;

            i--;
            j--;
        }



        // Check upper right diagonal

        i = row - 1;
        j = col + 1;


        while (i >= 0 && j < n) {

            if (board[i][j] == 'Q')
                return false;

            i--;
            j++;
        }


        return true;
    }



    // Backtracking function

    static void solveNQueens(char[][] board,
                             int row) {


        // Base Case

        if (row == n) {

            printBoard(board);

            return;
        }



        for (int col = 0; col < n; col++) {


            if (isSafe(board, row, col)) {


                // Choose

                board[row][col] = 'Q';



                // Explore

                solveNQueens(board, row + 1);



                // Backtrack

                board[row][col] = '.';
            }
        }
    }



    public static void main(String[] args) {


        char[][] board = new char[n][n];


        // Initialize board

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                board[i][j] = '.';
            }
        }


        solveNQueens(board, 0);
    }
}