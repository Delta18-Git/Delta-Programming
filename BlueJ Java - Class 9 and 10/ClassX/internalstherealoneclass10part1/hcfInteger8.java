package ClassX.internalstherealoneclass10part1;
import java.util.Scanner;

/**
 * Write a program print the HCF of two integers using the following 3 functions in the program.  
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class HCFInteger8
{
    int a,b;
    Scanner S = new Scanner(System.in);
    void accept()
    {
        System.out.println("Enter two numbers separated by a space.");
        a = S.nextInt();
        b = S.nextInt();
    }
    int HCF()
    {
        int hcf = 0;
        for(int i = 1; i <= Math.min(a,b); i++)
        {
            if ((a % i == 0) && (b % i == 0))
            {
                hcf = i;
            }
        }
        return hcf;
    }
    void main()
    {
        accept();
        System.out.println("The HCF of " + a + " and " + b + " is " + HCF());
    }
    }
