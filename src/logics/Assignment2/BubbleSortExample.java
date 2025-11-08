package logics.Assignment2;

import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 3, 1};
        int len = arr.length;// Step 1: Create an integer array
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

