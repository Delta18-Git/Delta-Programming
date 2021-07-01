package ClassX.methodsAssignments;

import java.util.*;
/**
 * Write a program to accept a number and check if its a perfect number or not.
 * A number that is equal to the sum of its factors (excluding itself) is a perfect number.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class perfect
{
    Scanner S = new Scanner(System.in);
    int n;
    void accept()
    {
        System.out.println("Enter a number to check for perfectness.");
        n = S.nextInt();
    }
    int factsum(int n)
    {
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                sum = sum + i;
            }
        }
        return sum;
    }
    void main()
    {
        int perfectCheck = factsum(n);
        if (n == perfectCheck)
        {
            System.out.println(n + " is a Perfect number.");
        }
        else
        {
            System.out.println(n + " isn't a Perfect number.");
        }
    }
}
