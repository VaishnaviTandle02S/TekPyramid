package logics.Assignment2;

public class BubbleSortExample {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 3, 1}; // Step 1: Create an integer array

        System.out.println("Before Sorting:");
        for (int num : arr) {
            System.out.print(num + " "); // Step 2: Print original array
        }

        // Step 3: Apply Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {      // Outer loop for passes
            for (int j = 0; j < arr.length - 1 - i; j++) { // Inner loop for comparisons
                if (arr[j] > arr[j + 1]) {              // Compare two adjacent elements
                    // Step 4: Swap if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\n\nAfter Sorting:");
        for (int num : arr) {
            System.out.print(num + " "); // Step 5: Print sorted array
        }
    }
}

