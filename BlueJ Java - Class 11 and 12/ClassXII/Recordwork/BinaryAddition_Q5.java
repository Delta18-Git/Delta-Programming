package ClassXII.Recordwork;
import java.util.Scanner;

/**
 * Write a program to add two binary numbers.
 *
 * @author (Vinaayak Gopala Dasika)
 * @version (15/03/2023)
 */
public class BinaryAddition_Q5
{
    static String in1 = "", in2 = "", out = "";
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two binary numbers to add.");
        in1 = sc.next();
        in2 = sc.next();
        if (in1.length() != in2.length())
        {
            String buffer = "";
            for(int i = 0; i < Math.abs(in1.length() - in2.length()); i++)
            {
                buffer += "0";
            }
            if(in1.length() > in2.length())
                in2 = buffer + in2;
            else
                in1 = buffer + in1;
        }
        in1 = "0" + in1;
        in2 = "0" + in2;
    }

    void add()
    {
        boolean carry = false;
        for(int i = in1.length() - 1; i >= 0; i--)
        {
            char dig1 = in1.charAt(i);
            char dig2 = in2.charAt(i);
            if(dig1 == '1' && dig2 == '1' && !carry)
            {
                out = "0" + out;
                carry = true;
            }
            else if(dig1 == '1' && dig2 == '1' && carry)
            {
                out = "1" + out;
                carry = true;
            }
            else if(dig1 == '1' || dig2 == '1' && !carry)
            {
                out = "1" + out;
                carry = false;
            }
            else if(dig1 == '1' || dig2 == '1' && carry)
            {
                out = "0" + out;
                carry = true;
            }
            else if(dig1 == '0' && dig2 == '0' && !carry)
            {
                out = "0" + out;
                carry = false;
            }
            else if(dig1 == '0' && dig2 == '0' && carry)
            {
                out = "1" + out;
                carry = false;
            }
            else
            {
                System.out.println("Crash repoert: Input not a binary number. Go touch grass, you've clearly lost you senses.");
                System.exit(0);
            }
        }
        out = out.substring(out.indexOf('1'));
    }

    void display()
    {
        System.out.println(in1);
        System.out.println("\t +");
        System.out.println(in2);
        System.out.println("\t =");
        System.out.println(out);
    }

    public static void main(String[] args)
    {
        BinaryAddition_Q5 obj = new BinaryAddition_Q5();
        obj.input();
        obj.add();
        obj.display();
    }

    public static void main()
    {
        String[] burp = {};
        BinaryAddition_Q5.main(burp);
    }
}
