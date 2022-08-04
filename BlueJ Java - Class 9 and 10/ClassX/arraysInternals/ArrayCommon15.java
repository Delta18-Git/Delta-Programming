package ClassX.arraysInternals;

import java.util.*;
/**
 * Write a description of class ArrayCommon15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class ArrayCommon15
{
    int input1[] = new int[10];
    int input2[] = new int[10];
    int common[] = new int[10];
    int i, j, a, b;
    void main()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter 10 numbers to check.");
        for(a = 0; a < input1.length; a++)
        {
            input1[a] = S.nextInt();
        }
        System.out.println("Enter another 10 numbers for second set.");
        for(b = 0; b < input2.length; b++)
        {
            input2[b] = S.nextInt();
        }
        System.out.println("The common numbers are:");
        for(i = 0; i < input1.length; i++) 
        {
            checkcommon();
        }
    }
    void checkcommon()
    {
        for (j = 0; j < input2.length; j++)
        {
            if (input1[i] == input2[j])
                System.out.println(input2[j]);
        }
    }
}