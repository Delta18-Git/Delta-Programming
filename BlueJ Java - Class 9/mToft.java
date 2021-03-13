import java.io.*;
/**
 * A class to convert metres to feet.
 *
 * @author (Vinaayak G Dasika)
 * @version (a version number or a date)
 */
public class mToft
{
    int l,ft;
    void main(int length_in_metres)
    {
        l = length_in_metres;
        ft = 12 * l;
        System.out.println("The length in feet is " + ft + " feet.");
    }
}
