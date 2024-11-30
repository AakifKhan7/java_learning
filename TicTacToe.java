import java.util.Scanner;

class TicTacToe {
    public static void main(String[] args) {
        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        char currentPlayer = 'X';
        boolean gameWon = false;
        int moves = 0;
        Scanner sc = new Scanner(System.in);

        while (!gameWon && moves < 9) {
            // Print the board
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j]);
                    if (j < 2) System.out.print(" | ");
                }
                System.out.println();
                if (i < 2) System.out.println(" ---+---+---");
            }

            // Player move
            System.out.println("Player " + currentPlayer + "'s turn:");
            int row, col;
            while (true) {
                System.out.print("Enter row (1- 3): ");
                row = sc.nextInt() - 1;
                System.out.print("Enter column (1 - 3): ");
                col = sc.nextInt() - 1;
                if (row >= 0 && row <= 3 && col >= 0 && col <= 3 && board[row][col] == ' ') {
                    break;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }

            board[row][col] = currentPlayer;

            // Check for win
            gameWon = (board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer) ||
                        (board[0][col] == currentPlayer && board[1][col] == currentPlayer && board[2][col] == currentPlayer) ||
                        (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                        (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);

            if (gameWon) {
                System.out.println("Player " + currentPlayer + " wins!");
                return;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            moves++;
        }
        sc.close();
        System.out.println("It's a draw!");
    }
}
