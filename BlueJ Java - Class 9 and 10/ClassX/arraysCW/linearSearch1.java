package ClassX.arraysCW;

import java.util.*;
/**
 * Write a program to accept n-integer elements and print the positions of x in the array.
 *
 * @author (Vinaayak Dasika)
 * @version (04/01/2022)
 */
public class linearSearch1
{
    void main()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter length of the array.");
        int n = S.nextInt();
        int array[] = new int[n];
        for(int i= 0; i < array.length; i++)
        {
            System.out.println("Enter the "+ i +" number.");
            array[i] = S.nextInt();
        }
        System.out.println("Enter the search number.");
        int x = S.nextInt();
        int flag = 0;
        System.out.println("Enter the elements of the array.");
        for(int i= 0; i < array.length; i++)
        {
            array[i] = S.nextInt();
        }
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == x)
            {
                flag++;
                System.out.println("It is the " + (i+1) + " term.");
                break;
            }
        }
        if (flag == 0)
            System.out.println("Search number not found.");
    }
}
