package GKG;

import java.util.Scanner;

public class first {
    public static long[] nextLargerElement(long[] arr, int n) {
        long nextGreater;
        long[] output = new long[n];
        for (int i = 0; i < n; i = i + 1) {
            nextGreater = -1;
            for (int j = i + 1; j < n; j = j + 1) {
                if (arr[i] < arr[j]) {
                    nextGreater = arr[j];
                    break;
                }
            }
            output[i] = nextGreater;
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long[] output = nextLargerElement(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(output[i]);

        }


    }
}
