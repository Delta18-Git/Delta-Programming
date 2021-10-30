package ClassX.internalstherealoneclass10part1;
import java.util.Scanner;

/**
 * Write a program to overload a function volume().
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class volumeOverload9
{
    double volume(double r)
    {
        double v =  4.0/3.0 * 22.0/7.0 * Math.pow(r,3);
        return v;
    }
    double volume(double h, double r)
    {
        double v = 22.0/7.0 * r * r * h;
        return v;
    }
    double volume(double l, double b, double h)
    {
        double v = l * b * h;
        return v;
    }
    void main()
    {
        System.out.println("Volume of sphere of radius of 2 units = " + volume(2.0) + " square units.");
        System.out.println("Volume of cylinder of radius of 2 units and height of 3 units = " + volume(3.0, 2.0) + " square units.");
        System.out.println("Volume of cuboid of length of 2 units, breadth of 3 units and height of 1 unit = " + volume(2.0, 3.0, 1.0) + " square units.");
    }
}