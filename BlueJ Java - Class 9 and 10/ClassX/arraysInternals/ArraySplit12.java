package ClassX.arraysInternals;
/**
 * Write a program to accept an integer array from the user. 
 * Find the odd numbers and even numbers and store them separately in two different arrays. 
 * Print all the arrays.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
class ArraySplit12
{
    int input[] = new int[20];
    int even[] = new int[20];
    int odd[] = new int[20];
    Scanner S = new Scanner(System.in);
    int oddi = 0, eveni = 0;
    void main()
    {
        System.out.println("Enter 20 numbers to sort.");
        for(int i = 0; i < input.length; i++)
        {
            input[i] = S.nextInt();
        }
        for(int i = 0; i < input.length; i++)
        {
            if (input[i] % 2 == 0)
            {
                even[eveni] = input[i];
                eveni++;
            }
            else
            {
                odd[oddi] = input[i];
                oddi++;
            }
        }
        System.out.print("Odd numbers: ");
        for(int i = 0; i < oddi; i++)
        {
            System.out.print(odd[i] + " ");
        }
        System.out.print("\nEven numbers: ");
        for(int i = 0; i < eveni; i++)
        {
            System.out.print(even[i] + " ");
        }
        System.out.print("\nAll numbers: ");
        for(int i = 0; i < input.length; i++)
        {
            System.out.print(input[i] + " ");
        }
    }
}