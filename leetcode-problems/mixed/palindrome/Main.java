import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        boolean ans = isPalindrome(num);
        if (ans) {
            System.out.print(num + " is a Palindrome.");
        } else {
            System.out.print(num + " is not a Palindrome.");
        }
    }

    public static boolean isPalindrome(int x) {
        int original = x;
        int rev = 0, r = 0;
        if (x < 0) {
            return false;
        }
        while (x != 0) {
            r = x % 10;
            x = x / 10;
            rev = rev * 10 + r;
        }

        if (original == rev) {
            return true;
        } else {
            return false;
        }
    }
}

