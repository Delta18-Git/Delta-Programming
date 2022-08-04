package ClassX.arraysCW;

import java.util.*;
/**
 * Write a description of class binarySearch1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class binarySearch1
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
        int upperLimit = array.length - 1;
        int lowerLimit = 0;
        int flag = 0;
        while(lowerLimit <= upperLimit)
        {
            int meanPos = (upperLimit + lowerLimit)/2;
            if (array[meanPos] < x)
                lowerLimit = meanPos + 1;
            else if (array[meanPos] > x)
                upperLimit = meanPos - 1;
            else if (array[meanPos] == x)
            {
                System.out.println("It is the " + (meanPos + 1) + " term.");
                flag++;
                break;
            }
        }
        if (flag == 0)
            System.out.println("Search number not found.");
    }
}
