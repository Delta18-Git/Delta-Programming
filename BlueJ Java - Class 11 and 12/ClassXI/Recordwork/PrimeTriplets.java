package ClassXI.Recordwork;

import java.util.*;
/**
 * 
 *
 * @author (your name)
 * @version (01/09/2022)
 */
public class PrimeTriplets
{
    int n;
    String str = " ";
    void input()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number to find prime triplets upto.");
        n = S.nextInt();
    }
    boolean isPrime(int num)
    {
        int count=0;
        if(num>1)
        {
            for(int j = 1; j <= num; j++)
            {
                if(num % j == 0)
                {
                    count++;
                }
            }
            if(count == 2)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    void out()
    {
        int c = 0;
        for(int x = 1; x <= n; x++)
        {
            if(x == 1)
                continue;
            else if(x == 2)
            {
                str = str + "2" + " ";
                c++;
            }
            else if(x % 2 == 0)
                continue;
            else if (isPrime(x))
            {
                str = str + x + " ";
                c++;    
                if (c == 3 && (x + 6) <= n)
                {
                    x--;
                    c = 0;
                    str = str.trim() + ", ";
                }
            }                
        }
        System.out.println(str);
    }
    public static void main(String[] args)
    {
        PrimeTriplets obj = new PrimeTriplets();
        obj.input();
        obj.out();
    }
}