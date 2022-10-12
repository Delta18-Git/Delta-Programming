package ClassXI.Recordwork;

import java.util.Scanner;

/**
 * Write a description of class UniqueNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UniqueDigits
{
    int input;
    int[] freq, in;
    boolean result;
    int distinct;
    public static void main(String[] args)
    {
        UniqueDigits obj = new UniqueDigits();
        obj.input();
        obj.check();
        obj.output();
    }
    void input()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number to check.");
        input = S.nextInt();
    }
    void check()
    {
        int temp = input;
        in = new int[String.valueOf(input).length()];
        freq = new int[String.valueOf(input).length()];
        for (int i = 0; i < in.length; i++)
        {
            in[i] = temp % 10;
            temp /= 10;
        }
        for (int i = 0; i < in.length; i++)
        {
            freq[i] = 1;
            for (int j = i + 1; j < in.length; j++)
            {
                if (in[i] == in[j])
                {
                    freq[i]++;
                    in[j] = -1; //trash value
                }
                if (in[i] == -1)
                    freq[i] = 0;
            }
        }
        for(int i = 0; i < in.length; i++)
        {   
            if (freq[i] == 1 && in[i] != -1)
            {    
                distinct++;
            }
        }
        if(distinct == in.length)
        {
            result = true;
        }
    }
    void output()
    {
        if (result)
            System.out.println(input + " has unique digits.");
        else
            System.out.println(input + " does not have unique digits.");
    }
}
