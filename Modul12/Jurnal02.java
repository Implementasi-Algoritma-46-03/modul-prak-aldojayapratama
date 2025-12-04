import java.util.Scanner;

public class Jurnal02 {

    public static char checkWinner(int[][] board, int N) {
        boolean hasEmptyCell = false;

        for (int i = 0; i < N; i++) {
            int rowO = 0, rowX = 0, colO = 0, colX = 0;

            for (int j = 0; j < N; j++) {
                if (board[i][j] == 0) {
                    hasEmptyCell = true;
                }
                if (board[i][j] == 1) rowO++;
                if (board[i][j] == 2) rowX++;
                if (board[j][i] == 1) colO++;
                if (board[j][i] == 2) colX++;
            }
            if (rowO == N || colO == N) return 'O';
            if (rowX == N || colX == N) return 'X';
        }
        int leftDiagonalO = 0, leftDiagonalX = 0;
        int rightDiagonalO = 0, rightDiagonalX = 0;

        for (int i = 0; i < N; i++) {
            if (board[i][i] == 1) leftDiagonalO++;
            if (board[i][i] == 2) leftDiagonalX++;
            if (board[i][N - 1 - i] == 1) rightDiagonalO++;
            if (board[i][N - 1 - i] == 2) rightDiagonalX++;
        }

        if (leftDiagonalO == N || rightDiagonalO == N) return 'O';
        if (leftDiagonalX == N || rightDiagonalX == N) return 'X';

        return hasEmptyCell ? '?' : '-';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] board = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        char winner = checkWinner(board, N);
        System.out.println(winner);

        scanner.close();
    }
}