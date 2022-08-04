package ClassX.arraysInternals;
import java.util.*;

/**
 * Write a description of class ArraySearchUser here.
 *
 * @author (Vinaayak G Dasika)
 * @version (20/2/2022)
 */
public class ArraySearchUser17
{
    void main()
    {
        Scanner S = new Scanner(System.in);
        double a[] = new double[10];
        for(int i = 0; i < a.length; i++)
        {
            System.out.println("Enter the "+ (i+1) +" number.");
            a[i] = S.nextDouble();
        }
        int flag = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == 9.8)
            {
                flag++;
                System.out.println("9.8 was found.");
                System.out.println("It is the " + (i+1) + " term.");
            }
        }
        if (flag == 0)
            System.out.println("9.8 not found.");
    }
}
