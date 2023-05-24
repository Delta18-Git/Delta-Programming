package ClassXII.Recordwork;
import java.util.Scanner;

/**
 * Write a menu driven program to apply bubble, selection and insertion sort for an integer array and a string.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MenuSort_Q18
{
    Scanner S = new Scanner(System.in);
    int[] bubbleSort(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - (1 + i); j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    int[] insertionSort(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = i + 1; j > 0; j--)
            {
                if(arr[j] < arr[j - 1])
                {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    int[] selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                // Find the index of the minimum element in the remaining unsorted portion of the array
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the minimum element with the first unsorted element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
    String[] bubbleSort(String[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - (1 + i); j++)
            {
                if(arr[j].compareTo(arr[j + 1]) > 0)
                {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    String[] insertionSort(String[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = i + 1; j > 0; j--)
            {
                if(arr[j].compareTo(arr[j - 1]) < 0)
                {
                    String temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    String[] selectionSort(String[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[j].compareTo(arr[minIndex]) < 0) 
                {
                    minIndex = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
    void displayArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(i != arr.length - 1)
                System.out.print(arr[i] + ",");
            else
                System.out.print(arr[i]);
        }
        System.out.println();
    }
    void displayArray(String[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(i != arr.length - 1)
                System.out.print(arr[i] + ",");
            else
                System.out.print(arr[i]);
        }
        System.out.println();
    }
    int[] inputInt()
    {
        System.out.println("Enter the number of elements to enter.");
        int size = Integer.parseInt(S.nextLine());
        int[] arr = new int[size];
        System.out.println("Enter the elements.");
        for(int i = 0; i < size; i++)
        {
            arr[i] = S.nextInt();
        }
        return arr;
    }
    String[] inputString()
    {
        System.out.println("Enter the number of elements to enter.");
        int size = S.nextInt();
        String[] arr = new String[size];
        System.out.println("Enter the elements.");
        for(int i = 0; i < size; i++)
        {
            arr[i] = S.nextLine();
        }
        return arr;
    }
    void start()
    {
        System.out.println("Choose whether to sort a String Array or a Integer Array (s/i)");
        char si = S.next().toLowerCase().charAt(0);
        switch(si)
        {
            case 's':
                System.out.println("Stting Array selected.");
                stringArray();
                break;
            case 'i':
                System.out.println("Integer Array selected.");
                integerArray();
                break;
            default:
                System.out.println("Invalid option chosen.");
                start();
        }
    }
    void stringArray()
    {
        String[] input = inputString();
        System.out.println("Choose the sorting technique.");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        int choice = S.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Bubble Sort selected.");
                System.out.println("Original Array:");
                displayArray(input);
                System.out.println("Sorted Array:");
                displayArray(bubbleSort(input));
                break;
            case 2:
                System.out.println("Selection Sort selected.");
                System.out.println("Original Array:");
                displayArray(input);
                System.out.println("Sorted Array:");
                displayArray(selectionSort(input));
                break;
            case 3:
                System.out.println("Insertion Sort selected.");
                System.out.println("Original Array:");
                displayArray(input);
                System.out.println("Sorted Array:");
                displayArray(insertionSort(input));
                break;
            default:
                System.out.println("Invalid option chosen.");
                stringArray();
        }
    }
    void integerArray()
    {
        int[] input = inputInt();
        System.out.println("Choose the sorting technique.");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        int choice = S.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Bubble Sort selected.");
                System.out.println("Original Array:");
                displayArray(input);
                System.out.println("Sorted Array:");
                displayArray(bubbleSort(input));
                break;
            case 2:
                System.out.println("Selection Sort selected.");
                System.out.println("Original Array:");
                displayArray(input);
                System.out.println("Sorted Array:");
                displayArray(selectionSort(input));
                break;
            case 3:
                System.out.println("Insertion Sort selected.");
                System.out.println("Original Array:");
                displayArray(input);
                System.out.println("Sorted Array:");
                displayArray(insertionSort(input));
                break;
            default:
                System.out.println("Invalid option chosen.");
                integerArray();
        }
    }
    public static void main(String[] args)
    {
        MenuSort_Q18 obj = new MenuSort_Q18();
        obj.start();
    }
}
