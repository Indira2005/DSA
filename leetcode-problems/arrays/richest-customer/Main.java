import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] accounts = {
                {1,3},
                {7,5},
                {3,5}
        };
        System.out.println("Maximum: " + maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int sum = 0;
        int sumA= 0;
        for (int row = 0; row < accounts.length; row++) {
            for (int col = 0; col < accounts[row].length; col++) {
                sum = sum + accounts[row][col];
            }
            if (sum > sumA) {
                sumA = sum;
            }
            sum = 0;
        }
        return sumA;
    }

}
