package ClassXII.Recordwork;
import java.util.Scanner;


/**
 * Write a description of class EvilNumber_Q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EvilNumber_Q6
{
    String binary = "";
    final int base = 2;
    void convert()
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER TO CHECK IF IT IS AN EVIL NUMBER: ");
        int dec = Sc.nextInt();
        System.out.print("BINARY REPRESENTATION OF " + dec);
        while(dec > 0)
        {
            int d = dec % base;
            dec /= base;
            binary = d + binary;            
        }
        System.out.println(" IS: " + binary);
    }
    boolean superno()
    {
        int out = 0;
        for(int i = 0; i < binary.length(); i++)
        {
            if(binary.charAt(i) == '1')
                out++;
        }
        return out % 2 == 0;
    }
    void print()
    {
        if(superno())
            System.out.print("NOT AN EVIL NUMBER");
        else
            System.out.print("EVIL NUMBER");
    }
    public static void main()
    {
        EvilNumber_Q6 obj = new EvilNumber_Q6();
        obj.convert();
        obj.print();
    }
}
