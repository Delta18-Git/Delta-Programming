import java.io.*;
/**
 * To convert decimal nos. into its parts.
 *
 * @author (Vinaayak G Dasika)
 * @version (a version number or a date)
 */
public class decToparts
{
    double dec;
    int whole;
    void main(double number_to_be_split)
    {
        whole = (int)number_to_be_split;
        dec = number_to_be_split - (double)whole;
        System.out.println("Integer Part = " + whole);
        System.out.println("Decimal Part = " + dec);
    }
}
