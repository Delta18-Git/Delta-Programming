import java.util.*;
class ArrayReorder{
    // A method to rearrange an array as per the given specifications
    public static void rearrange(int[] arr) {
        // Get the length of the array
        int n = arr.length;
        // Check if the array is empty or has only one element
        if (n == 0 || n == 1) {
            return; // Nothing to do
        }
        // Sort the array in ascending order using Arrays.sort()
        Arrays.sort(arr);
        // Find the middle index of the array
        int mid = n / 2;
        // Find the index of the greatest element in the array
        int maxIndex = n - 1;
        // Swap the greatest element with the middle element
        swap(arr, maxIndex, mid);
        // Loop through the array from left and right
        for (int i = 0; i < mid; i++) {
            // If the index is even, swap the element with the element at mid - i - 1
            if (i % 2 == 0) {
                swap(arr, i, mid - i - 1);
            }
            // If the index is odd, swap the element with the element at mid + i + 1
            else {
                swap(arr, i, mid + i + 1);
            }
        }
    }

    // A helper method to swap two elements in an array
    public static void swap(int[] arr, int a, int b) {
        // Use a temporary variable to store one of the values
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // A method to print an array
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // A main method to test the program
    public static void main(String[] args) {
        // Create a sample array
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        // Print the original array
        System.out.println("Original array:");
        printArray(arr);

        // Rearrange the array
        rearrange(arr);

        // Print the rearranged array
        System.out.println("Rearranged array:");
        printArray(arr);
    }
}