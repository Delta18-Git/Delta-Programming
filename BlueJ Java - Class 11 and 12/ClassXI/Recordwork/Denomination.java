package ClassXI.Recordwork;
import java.util.Scanner;

/**
 * Write a description of class Denomination here.
 *
 * @author (Vinaayak Gopala Dasika)
 * @version (11/08/2022)
 */
public class Denomination
{
    int in, fif = 0, twen = 0, five = 0, two = 0, one = 0;
    void input()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a number.");
        in = S.nextInt();
    }
    void calc()
    {
        int temp = in;
        while (temp > 0)
        {
            if (temp >= 50)
            {
                temp -= 50;
                fif++;
            }
            else if (temp < 50 && temp >= 20)
            {
                temp -= 20;
                twen++;
            }
            else if (temp < 20 && temp >= 5)
            {
                temp -= 5;
                five++;
            }
            else if (temp < 5 && temp >= 2)
            {
                temp -= 2;
                two++;
            }
            else
            {
                temp -= 1;
                one++;
            }
        }
    }
    void output()
    {
        System.out.println("50 * " + fif + " = " + (50 * fif));
        System.out.println("20 * " + twen + " = " + (20 * twen));
        System.out.println("5 * " + five + " = " + (5 * five));
        System.out.println("2 * " + two + " = " + (2 * two));
        System.out.println("1 * " + one + " = " + one);
        System.out.println("Total = " + in);
    }
    void main()
    {
        Denomination obj = new Denomination();
        obj.input();
        obj.calc();
        obj.output();
    }
}