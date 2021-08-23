package ClassX;
import java.io.*;

/**
 * Write a description of class methodOverloadingArea here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class methodOverloadingArea
{
    void main()
    {
        double area1 = area(2,4);
        double area2 = area(3,4,5);
        System.out.println(area1 + "\n" + area2);
    }
    double area(double b, double h)
    {
        return (0.5*b*h);
    }
    double area(double s1, double s2, double s3)
    {
        double s = (s1+s2+s3)/2.0;
        return (Math.sqrt((s*(s-s1)*(s-s2)*(s-s3))));
    }
}