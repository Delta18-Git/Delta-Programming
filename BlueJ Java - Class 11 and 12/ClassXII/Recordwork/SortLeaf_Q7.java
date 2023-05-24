package ClassXII.Recordwork;
import java.util.Scanner;

/**
 * Write a program where you create a single subscripted array of n > 0 integers. 
 * Get the elements of the array from the user. 
 * Rearrange the same array in place in such a manner that the greatest number should be placed in the middle, 
 * to its right second greatest, on the left side if the greatest third greatest and so on.
 *
 * @author (Vinaayak Gopala Dasika)
 * @version (11/04/2023)
 */
public class SortLeaf_Q7
{
    // `int[] arr;` is declaring an instance variable `arr` of type integer array. This variable will
    // be used to store the elements of the array that the user inputs.
    int[] arr; 
    // `int n;` is declaring an instance variable `n` of type integer. This variable will be used to
    // store the length of the array that the user inputs.
    int n;
    /** 
     * `SortLeaf_Q7(int size)` is a constructor method that creates an instance of the `SortLeaf_Q7`
     *  class with an array of integers of size `size`.
     */
    SortLeaf_Q7(int size)
    {
        arr = new int[size];
        n = size;
    }
    /**
     * This function takes input from the user for an array.
     */
    void input()
    {
        System.out.println("Enter the elements of the array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
    /**
     * Rearranges the array with the maximum element at the middle.
     */
    void sort()
    {
        int midpos = arr.length/2;
        for(int i = 2; i < arr.length; i += 2)
        {
            int temp;
            temp = arr[i];
                arr[i] = arr[i/2];
                arr[i/2] = temp;
        }
        for(int i = midpos; i < arr.length - 1; i++)
        {
            for(int j = midpos; j < arr.length - i + midpos - 1; j++)
            {
                if(arr[j] < arr [j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    /**
     * The function outputs the rearranged array elements.
     */
    void output()
    {
        System.out.println("Rearranged Array:");
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
    /**
     * The main function takes user input for the length of an array, creates an object of the
     * SortLeaf_Q7 class, calls its input, sort, output, and close methods.
     */
    public static void main(String[] args)
    {
        System.out.println("Enter the length of the array.");
        SortLeaf_Q7 obj = new SortLeaf_Q7(new Scanner(System.in).nextInt());
        obj.input();
        obj.sort();
        obj.output();
    }
}