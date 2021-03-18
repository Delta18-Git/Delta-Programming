import java.io.*;
import java.util.*;
/**
 * Write a description of class discriminant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class discriminant
{
   double a,b,c,d;
   void main()
   {
       Scanner S = new Scanner(System.in);
       System.out.println("Enter the coefficients a followed by b then c.");
       a = S.nextDouble();
       b = S.nextDouble();
       c = S.nextDouble();
       d = b - 4*(a*c);
       System.out.println("The discroiminant D is = "+d);
   }
}
