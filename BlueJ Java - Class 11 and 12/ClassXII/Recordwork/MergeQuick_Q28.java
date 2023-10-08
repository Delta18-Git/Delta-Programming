package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * <Enter question here.>
 *
 * @author Vinaayak Gopala Dasika
 * @version 2/8/2023
 */
public class MergeQuick_Q28
{    
    
    /**
     * Merge sort algorithm to sort an array in ascending order.
     *
     * @param  arr  the array to be sorted
     * @param  lwr  the lower index of the subarray to be sorted
     * @param  upr  the upper index of the subarray to be sorted
     */
    void mergeSort(int[] arr, int lwr, int upr) {
        if(lwr < upr) {
            int mid = lwr + (upr - lwr)/2;
            mergeSort(arr, lwr, mid);
            mergeSort(arr, mid + 1, upr);
            merge(arr, lwr, mid, upr);
        }
    }
    
    /**
     * Merge two sorted subarrays into one sorted array.
     *
     * @param  arr  the array to be merged
     * @param  low  the starting index of the first subarray
     * @param  mid  the ending index of the first subarray
     * @param  up   the ending index of the second subarray
     */
    void merge(int[] arr, int low, int mid, int up) {
        int n1 = mid - low + 1;
        int n2 = up - mid;
        int[] lower = new int[n1 + 1];
        int[] upper = new int[n2 + 1];
        int k = low;
        for(int i = 0; i < n1; i++) {
            lower[i] = arr[low + i];
        }
        for(int j = 0; j < n2; j++) {
            upper[j] = arr[mid + 1 + j];
        }
        int i = 0;
        int j = 0;
        while(i < n1 && j < n2) {
            if(lower[i] <= upper[j]) {
                arr[k++] = lower[i++];
            }
            else {
                arr[k++] = upper[j++];
            }
        }
        while(i < n1) {
            arr[k++] = lower[i++];
        }
        while(j < n2) {
            arr[k++] = upper[j++];
        }
    }
    
    /**
     * Sorts an array of integers using the QuickSort algorithm.
     *
     * @param  arr   the array to be sorted
     * @param  lwr   the lower index of the subarray to be sorted
     * @param  upr   the upper index of the subarray to be sorted
     */
    void quickSort(int[] arr, int lwr, int upr) {
        if(lwr < upr) {
            int part = partition(arr, lwr, upr);
            quickSort(arr, lwr, part - 1);
            quickSort(arr, part + 1, upr);
        }
    }
    
    /**
     * Partitions an array around a pivot element.
     *
     * @param  arr  the array to be partitioned
     * @param  low  the lower index of the array
     * @param  up   the upper index of the array
     * @return      the index of the pivot element after partitioning
     */
    int partition(int[] arr, int low, int up) {
        int pivotPos = low + (int) Math.floor(Math.random() * (up - low + 1)) ;
        int pivot = arr[pivotPos];
        int i = low;
        int j = up;
        while(i < j) {
            while(i < j && arr[j] > pivot) {
                j--;
            }
            arr[i] = arr[j];
            while(i < j && arr[i] <= pivot) {
                i++;
            }
            arr[j] = arr[i];
        }
        arr[i] = pivot;
        return i;
    }
    
    /**
     * Prompts the user to enter the number of elements in an array,
     * reads the numbers from the user, and then allows the user to choose between
     * sorting the array using QuickSort or MergeSort. It then sorts the array
     * accordingly and prints the sorted array.
     *
     */
    void menu() {
        Scanner sysIn = new Scanner(System.in);    
        System.out.print("Enter number of elements of the array: ");
        int x = sysIn.nextInt();
        int[] array = new int[x];
        System.out.println("Enter " + x + " numbers.");
        for(int i = 0; i < x; i++) {
            array[i] = sysIn.nextInt();
        }
        System.out.println("Choose from the following:");
        System.out.println("1. Sort using QuickSort");
        System.out.println("2. Sort using MergeSort");
        System.out.print("Choice (1/2): ");
        int c = 0;
        while(true) {
            c = sysIn.nextInt();
            if(c > 2 || c < 1) {
                System.out.println("Invalid choice.");
                System.out.print("Choice (1/2): ");
            }
            else {
                break;
            }
        }
        System.out.print("Unsorted array: [");
        for(int i = 0; i < x - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[x - 1] + "]");
        if(c == 1) {
            quickSort(array, 0, x - 1);
        }
        else {
            mergeSort(array, 0 , x - 1);
        }
        System.out.print("Sorted array: [");
        for(int i = 0; i < x - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[x - 1] + "]");
        sysIn.close();
    }
    
    public static void main(String[] args) {
        MergeQuick_Q28 obj = new MergeQuick_Q28();
        obj.menu();
    }
}
