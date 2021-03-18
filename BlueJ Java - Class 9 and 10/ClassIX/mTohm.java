import java.io.*;
/**
 * Write a description of class mtohm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mTohm
{
    int hrs, min;
    void main(int input_in_min)
    {
        hrs = (input_in_min/60);
        min = input_in_min - (hrs*60);
        System.out.println(hrs + " hours, " + min + " minutes");
    }
}
