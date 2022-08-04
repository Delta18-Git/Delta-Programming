package ClassX.arraysInternals;
/**
 * Write a program in Java to input integer elements into an array of size 20 
 * and perform the following operations: 
 * i) Display largest number from the array 
 * ii) Display smallest number from the array 
 * iii) Display sum of all the elements of the array
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
class ArrayOperations13
{
    int input[] = new int[20];
    int mini, maxi = 0, sum = 0;
    Scanner S = new Scanner(System.in);
    void main()
    {
        System.out.println("Enter 20 numbers to check.");
        for(int i = 0; i < input.length; i++)
        {
            input[i] = S.nextInt();
        }
        mini = input[0];
        for(int i = 0; i < input.length; i++)
        {
            maxi = Math.max(input[i], maxi);
            mini = Math.min(input[i], mini);
            sum += input[i];
        }
        System.out.println("Largest number: " + maxi);
        System.out.println("Smallest number: " + mini);
        System.out.println("Sum of numbers: " + sum);
    }
}