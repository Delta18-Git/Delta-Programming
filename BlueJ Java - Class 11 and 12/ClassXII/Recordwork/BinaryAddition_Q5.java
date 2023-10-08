package ClassXII.Recordwork;

import java.util.Scanner;

/**
 * Write a program to add two binary numbers.
 *
 * @author Vinaayak Gopala Dasika
 * @version 15/3/2023
 */
public class BinaryAddition_Q5 {
    String in1 = "", in2 = "", out = "";

    /**
     * The function takes two binary numbers as input, ensures they have the same length by padding with
     * zeros, and adds a leading zero to each number.
     */
    void input() {
        Scanner sysIn = new Scanner(System.in);
        System.out.println("Enter two binary numbers to add.");
        in1 = sysIn.next();
        in2 = sysIn.next();
        sysIn.close();
        if (in1.length() != in2.length()) {
            String buffer = "";
            for (int i = 0; i < Math.abs(in1.length() - in2.length()); i++) {
                buffer += "0";
            }
            if (in1.length() > in2.length()) {
                in2 = buffer + in2;
            }
            else {
                in1 = buffer + in1;
            }
        }
        in1 = "0" + in1;
        in2 = "0" + in2;
    }

    /**
     * The function performs binary addition on two input strings and stores the result in the 'out'
     * variable.
     */
    void add() {
        boolean carry = false;
        for (int i = in1.length() - 1; i >= 0; i--) {
            char dig1 = in1.charAt(i);
            char dig2 = in2.charAt(i);
            if (dig1 == '1' && dig2 == '1' && !carry) {
                out = "0" + out;
                carry = true;
            }
            else if (dig1 == '1' && dig2 == '1' && carry) {
                out = "1" + out;
                carry = true;
            }
            else if (dig1 == '1' || dig2 == '1' && !carry) {
                out = "1" + out;
                carry = false;
            }
            else if (dig1 == '1' || dig2 == '1' && carry) {
                out = "0" + out;
                carry = true;
            }
            else if (dig1 == '0' && dig2 == '0' && !carry) {
                out = "0" + out;
                carry = false;
            }
            else if (dig1 == '0' && dig2 == '0' && carry) {
                out = "1" + out;
                carry = false;
            }
            else {
                System.out.println("Crash report: Input not a binary number.");                System.exit(0);
            }
        }
        out = out.substring(out.indexOf('1'));
    }

    /**
     * The function "display" prints the values of in1, in2, and out in a formatted manner.
     */
    void display() {
        System.out.println(in1);
        System.out.println("\t +");
        System.out.println(in2);
        System.out.println("\t =");
        System.out.println(out);
    }

    public static void main(String[] args) {
        BinaryAddition_Q5 obj = new BinaryAddition_Q5();
        obj.input();
        obj.add();
        obj.display();
    }

    public static void main() {
        String[] argv = {};
        BinaryAddition_Q5.main(argv);
    }
}
