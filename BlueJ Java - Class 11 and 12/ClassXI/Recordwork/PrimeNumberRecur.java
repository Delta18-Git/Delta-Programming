package ClassXI.Recordwork;

import java.util.Scanner;

/**
 * Write a description of class PrimeNumberRecur here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrimeNumberRecur
{
    static final int x = 2; //x = 2 is starting value
    boolean isPrime(int n, int divisor)
    {
        if (n == divisor) 
            return true;
        else if (n % divisor == 0) 
            return false; 
        else
            return isPrime(n, divisor + 1);
    }
    int input()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number to check if prime.");
        return S.nextInt(); //Returns integer input by user
    }
    void output(int input, boolean result)
    {
        if (result)
            System.out.println(input + " is prime."); 
        else
            System.out.println(input + " is not prime.");
    }
    public static void main(String[] args)
    {
        PrimeNumberRecur obj = new PrimeNumberRecur();
        int in = obj.input();
        obj.output(in, obj.isPrime(in, x)); //Calls output with input from user and if input is prime number's result
    }
}
