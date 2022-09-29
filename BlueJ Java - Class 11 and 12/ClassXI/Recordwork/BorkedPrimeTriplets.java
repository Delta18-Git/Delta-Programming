package ClassXI.Recordwork;

import java.util.*;
/**
 * Write a description of class printNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BorkedPrimeTriplets
{
    int n;
    void input()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number to find prime triplets upto.");
        n = S.nextInt();
    }

    void out()
    {
        int c = 0;
        int j=0,count=0;
        boolean flag=true;
        for(int x = 1; x <= n; x++)
        {
            if(x % 2 == 0)
                continue;
            if(x > 1)
            {
                if(x == 1)
                    continue;
                if(x == 2)
                {
                    System.out.print(x + " ");
                    c++;
                }
                for(j = 1; j <= x; j++)
                {
                    if(x % j == 0)
                    {
                        count++;
                    }
                }
                if(count == 2)
                {
                    System.out.print(x + " ");
                    c++;    
                    if (c == 3 && x != n && x != (n - 1))
                    {
                        x--;
                        c = 0;
                        System.out.print(",");
                    }
                }
                else
                {
                    continue;
                }
            }
            else
            {
                continue;
            }          
        }
    }

    public static void main()
    {
        BorkedPrimeTriplets obj = new BorkedPrimeTriplets();
        obj.input();
        obj.out();
    }
}
