package ClassXI.Recordwork;
import java.util.*;

/**
 * Write a description of class DecToBin here.
 *
 * @author (Vinaayak Gopala Dasika)
 * @version (11/08/2022)
 */
public class DecToBin
{
    int decimal, out;
    void input()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a number.");
        decimal = S.nextInt();
    }
    void calculate()
    {
        out = 0;
        String str = " ";
        int temp = decimal, rem = 0;
        while (temp > 0)
        {
            rem = temp % 2;
            temp = temp / 2;
            str = rem + str;
        }
        out = Integer.valueOf(str.trim());
    }
    void output()
    {
        System.out.println("Binary value of " + decimal +  " = " + out);
    }
    public static void main(String[] args)
    {
        DecToBin obj = new DecToBin();
        obj.input();
        obj.calculate();
        obj.output();
    }
}