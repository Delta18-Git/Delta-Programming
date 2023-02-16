package ClassXII;

import java.util.Scanner;
/**
 * Unique digit integer is a positive integer (without leading 0s) with no duplicate digits. Ex: 7, 135, 214 etc.
 * Given 2 positive integers, n, m where m < n, write a program ti deternine the number of unique digit integers
 * between m to n (both inclusive) and display them, The input contains two positive integers m & n.
 * Assume m < 3000, n < 3000.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UniqueDigit
{
    private boolean unique(int n)
    {
        boolean unique = true;
        char[] digits = Integer.toString(n).toCharArray();
        int[] frequency = new int[10];
        for (int i = 0; i < frequency.length; i++)
        {
            for (int j = 0; j < digits.length; j++)
            {
                if ((int)digits[j] == (48 + i))
                {
                    frequency[i]++;
                }
            }
        }
        for (int x = 0; x < frequency.length; x++)
        {
            if(frequency[x] > 1)
            {   
                return false;
            }
        }
        return true;
    }
    private void check(int m, int n)
    {
        int[] uniquenos = new int[(n-m)];
        int c = 0;
        for(int q = m; q <= n; q++)
        {
            if(unique(q))
            {
                uniquenos[c++] = q;
            }
        }
        System.out.println("The Unique digit integers are: ");
        for(int y = 0; y < c; y++)
        {
            if(uniquenos[y] != 0 && y < c - 1)
            {
                System.out.print(uniquenos[y] +", ");
            }
            else if(uniquenos[y] != 0)
            {
                System.out.println(uniquenos[y]);
            }
        }
        System.out.println("Frequency of Unique digit integers is " + c);
    }
    public void start()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("m = ");
        int from = sc.nextInt();
        System.out.print("n = ");
        int to = sc.nextInt();
        boolean valid = (from < 3000 && to < 3000 && from < to && from > 0 && to > 0) ? true : false;
        if(valid)
        {
            check(from, to);
        }
        else
        {
            System.out.println("Invalid range");
        }
    }
    public static void main(String[] args)
    {
        UniqueDigit obj = new UniqueDigit();
        obj.start(); 
    }
}
