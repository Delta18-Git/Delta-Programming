package ClassX.groupWorkupperLeftpattern;
/**
 * Write a description of class starPattern here.
 *
 * @author (Vinaayak G Dasika, Rishi Senthivel, Nikhil Sampath)
 * @version (22/04/2021)
 */
public class numberPattern
{
    void main()
    {
        int x = 1;
        for(int i = 5; i>=1; i--)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(x);
            }
            System.out.println();
            x++;
        }
    }
}