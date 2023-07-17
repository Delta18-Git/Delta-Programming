package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * Write a program to convert decimal to hexadecimal.
 * 
 * @author Vinaayak Gopala Dasika
 * @version 8/3/2022
 */
public class HexRecursion_Q29 {
    /**
	 * The function converts a decimal number to its hexadecimal representation.
	 * 
	 * @param n The parameter "n" is an integer that represents the decimal number that we want to
	 * convert to hexadecimal.
	 * @return The method is returning a string representation of the given integer in hexadecimal
	 * format.
	 */
	static String convert(int n) {
        if (n == 0) {
            return "0x";
        }
        else if (n % 16 == 10) {
            return convert(n / 16) + "A";
        }
        else if (n % 16 == 11) {
            return convert(n / 16) + "B";
        }
        else if (n % 16 == 12) {
            return convert(n / 16) + "C";
        }
        else if (n % 16 == 13) {
            return convert(n / 16) + "D";
        }    
        else if (n % 16 == 14) {
            return convert(n / 16) + "E";
        }
        else if (n % 16 == 15) {
            return convert(n / 16) + "F";
        }
        return convert(n / 16) + Integer.toString(n % 16);
    }
    public static void main(String[] args) {
        HexRecursion_Q29 obj = new HexRecursion_Q29();
        System.out.print("Decimal Number to Convert: ");
        Scanner sysIn = new Scanner(System.in);
        int a = sysIn.nextInt();
        System.out.println("Hexadecimal Number: " + obj.convert(a));
		sysIn.close();
    }
}
