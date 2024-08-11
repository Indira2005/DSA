import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = in.nextInt();
        System.out.print("Columns: ");
        int columns = in.nextInt();
        int[][] grid = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                grid[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Value: ");
        int val = in.nextInt();
        int aSum = 0, dSum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == val) {
                    if (i > 0) {
                        aSum += grid[i-1][j];
                    }
                    if (i < rows-1) {
                        aSum += grid[i+1][j];
                    }
                    if (j > 0) {
                        aSum += grid[i][j-1];
                    }
                    if (j < columns - 1) {
                        aSum += grid[i][j+1];
                    }

                    if (i > 0 && j > 0) {
                        dSum += grid[i-1][j-1];
                    }
                    if (i < rows-1 && j < columns-1) {
                        dSum += grid[i+1][j+1];
                    }
                    if (i < rows-1 && j > 0) {
                        dSum += grid[i+1][j-1];
                    }
                    if (i > 0 && j < columns-1) {
                        dSum += grid[i-1][j+1];
                    }
                }
            }
        }
        System.out.println("Adjacent Sum = " + aSum);
        System.out.print("Diagonal Sum = " + dSum);
    }
}
