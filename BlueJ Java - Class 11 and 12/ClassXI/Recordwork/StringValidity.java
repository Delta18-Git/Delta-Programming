package ClassXI.Recordwork;

import java.util.Scanner;
/**
 * Write a description of class StringValidity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringValidity
{
    String str;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        str = sc.next();
    }
    void valid()
    {
        int l = str.length();
        if((str.charAt(0) == '(' && str.charAt(l-1) == ')') && (str.charAt(1) != '(' && str.charAt(l-2) != ')'))
            System.out.println("It is a Valid String");
        else
            System.out.println("It is not a Valid String");
    }
    public static void main(String[] args) 
    {
        StringValidity obj = new StringValidity();
        obj.input();
        obj.valid();
    }
}

