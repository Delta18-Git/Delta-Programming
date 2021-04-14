package ClassX.nestedLoopsAssignment;
import java.util.Scanner;

/**
 * A class to find the factorials of 1 to n.
 *
 * @author (Vinaayak G Dasika)
 * @version (5/4/12021 HE)
 */
public class varFactorial
{
    int i,x; Scanner S = new Scanner(System.in);
    void main()
    {
        System.out.println("Enter a number");
        int number=S.nextInt();
        for (x=1; x<=number; x++)
        {
            int fact=1;
            for(i=1;i<=x;i++)
            {    
                fact=fact*i;   
            }    
            System.out.println("Factorial of "+x+" is: "+fact);
        }
    }
}