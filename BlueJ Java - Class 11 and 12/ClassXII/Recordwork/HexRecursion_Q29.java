package ClassXII.Recordwork;

/**
 * Write a program to convert decimal to hexadecimal.
 * Program 29
 * @author (Vinaayak Gopala Dasika)
 * @version (08/03/2022)
 */
public class HexRecursion_Q29 
{
    static String convert(int n)
    {
        if (n == 0)
            return "0x";
        else if (n%16 == 10)
            return convert(n/16) + "A";
        else if (n%16 == 11)
            return convert(n/16) + "B";
        else if (n%16 == 12)
            return convert(n/16) + "C";
        else if (n%16 == 13)
            return convert(n/16) + "D";
        else if (n%16 == 14)
            return convert(n/16) + "E";
        else if (n%16 == 15)
            return convert(n/16) + "F";
        return convert(n/16) + Integer.toString(n%16);
    }
    public static void main(String[] args) {
        HexRecursion_Q29 obj = new HexRecursion_Q29();
        System.out.println(obj.convert(250));
    }    
}
