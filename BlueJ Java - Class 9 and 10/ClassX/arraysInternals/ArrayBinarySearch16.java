package ClassX.arraysInternals;
import java.util.*;

/**
 * Write a program to accept the year of graduation from school as an integer value from the user. 
 * Using the binary search technique on the sorted array of integers given below, output the message “Record exists” if the value input is located in the array. 
 * If not, output the message “Record does not exist”.
 *
 * @author (Vinaayak G Dasika)
 * @version (20/2/2022)
 */
class ArrayBinarySearch16
{
    Scanner S = new Scanner(System.in);
    int array[] = {1982, 1987,1993,1996,2000,2003,2005,2009,2012};
    int uL = array.length - 1;
    int lL = 0;
    boolean flag = false;
    void main()
    {
        System.out.println("Enter the graduating year.");
        int x = S.nextInt();
        while(lL <= uL)
        {
            int m = (uL + lL)/2;
            if (array[m] < x)
                lL = m + 1;
            else if (array[m] > x)
                uL = m - 1;
            else if (array[m] == x)
            {
                System.out.println("Record exists.");
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("Record does not exist.");
    }
}