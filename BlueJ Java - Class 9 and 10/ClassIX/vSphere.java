import java.io.*;
/**
 * This is a class to calculate the volume of a sphere.
 *
 * @author (Vinaayak G Dasika)
 * @version (11/7/2020)
 */
public class vSphere
{
   double r = 3.5;
   double v;
   void main()
   {
       v = 1.3333333333*(3.14*(r*r*r));
       System.out.println("The volume of the sphere is "+ v + "cube cm.");
   }
}
