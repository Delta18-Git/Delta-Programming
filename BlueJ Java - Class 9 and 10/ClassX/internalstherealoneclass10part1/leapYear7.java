package ClassX.internalstherealoneclass10part1;
import java.util.Scanner;

/**
 * Write a program to print all the leap years from 1000 to n.
 *
 * @author (Vinaayak G Dasika)
 * @version (a version number or a date)
 */
class leapYear7
{
    Scanner S = new Scanner(System.in);
    int n;
    void accept()
    {
        System.out.println("Enter the end year for printing leap years.");
        n = S.nextInt();
    }
    void yearprint()
    {
        for (int i = 1000; i <= n; i++)
        {
            if (i % 4 == 0)
            {
                System.out.println(i);
            }
        }
    }
    void main()
    {
        accept();
        yearprint();
    }
}
