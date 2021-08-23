package ClassX;

/**
 * Write a Single program with the following functions. Call all the functions in main( )
 * void show(int i) - to Print the factorial of i
 * void show(int a, int b) - to Print the values from a to b
 * void show(char a, int m) - to print the mth character from a.
 *
 * @author (Vinaayak G Dasika)
 * @version (30/07/2021)
 */
public class methodOverloadAssgnmnt
{
    void main()
    {
        show(5);
        show(7, 29);
        show('a', 5);
    }
    void show(int i)
    {
        int fact = 1;
        for(int x = 1; x <= i; x++)
        {    
            fact *= x;
        }    
        System.out.println("Factorial of " + i + " is: " + fact);
    }
    void show(int a, int b)
    {
        int tmpa = a, tmpb = b;
        while (tmpa <= tmpb)
        {
            System.out.println(tmpa);
            tmpa++;
        }
    }
    void show(char a, int m)
    {
        int tmp = a + m;
        char tmpa = (char)tmp;
        System.out.println(tmpa);
    }
}