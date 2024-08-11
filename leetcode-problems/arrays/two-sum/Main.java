import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[2];
        System.out.print("Enter size of array: ");
        int n = in.nextInt();

        int[] a = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        System.out.print("Enter target element: ");
        int val = in.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = a[i];
            for (int j = i+1; j < n; j++) {
                if (sum + a[j] == val) {
                    array[0] = i;
                    array[1] = j;
                }
            }
        }
        for (int i = 0; i <2; i++){
            System.out.print(array[i] + " ");
        }

    }
}

