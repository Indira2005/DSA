import java.util.Scanner;

public class Evendigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num: nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numOfDigits = digits(num);
        if (numOfDigits % 2 == 0){
            return true;
        }
        return false;
    }

    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
    static int digits(int num) {
        int count = 0;
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        while (num > 0) {
            count++;
            num = num/10;
        }
        return count;
    }
}
