package ClassXII;

import java.util.Scanner;
/**
 * Unique digit integer is a positive integer (without leading 0s) with no duplicate digits. Ex: 7, 135, 214 etc.
 * Given 2 positive integers, n, m where m < n, write a program ti deternine the number of unique digit integers
 * between m to n (both inclusive) and display them, The input contains two positive integers m & n.
 * Assume m < 3000, n < 3000.
 *
 * @author (Vinaayak Gopala Dasika)
 * @version (15/02/2023)
 */
public class UniqueDigit
{
    /**
     * The function takes an integer as an argument and returns true if the integer contains unique
     * digits and false if it doesn't
     * 
     * @param n The number to be checked.
     * @return The method is returning a boolean value.
     */
    private boolean unique(int n)
    {
        boolean unique = true;
        // The `Integer.toString(n)` is converting the integer `n` to a string. The `toCharArray()` is
        // converting the string to a character array.
        char[] digits = Integer.toString(n).toCharArray();
        // The array `frequency` is used to store the frequency of each digit in the number.
        int[] frequency = new int[10];
        // The first for loop is iterating through the array `frequency`. The second for loop is
        // iterating through the array `digits`.
        // The if condition is checking the frequency of each digit in the number.
        for (int i = 0; i < frequency.length; i++)
        {
            // Checking the frequency of each digit in the number.
            for (int j = 0; j < digits.length; j++)
            {
                // The ASCII value of 0 is 48. So, we are adding 48 to the index of the array to get
                // the ASCII value of the digit.
                if ((int)digits[j] == (48 + i))
                {
                    // Incrementing the frequency of the digit.
                    frequency[i]++;
                }
            }
            if(frequency[i] > 1)
            {   
                return false;
            }
        }
        return true;
    }
    /**
     * It takes in two integers, m and n, and checks if the integers between m and n are unique
     * 
     * @param m The starting number of the range
     * @param n The upper limit of the range of numbers to be checked.
     */
    private void check(int m, int n)
    {
        // The array `uniquenos` is used to store the unique numbers between m and n.
        int[] uniquenos = new int[(n-m)];
        // The variable `c` is used to store the frequency of unique numbers.
        int c = 0;
        // This is iterating through the range of numbers from m to n and checking if the number is
        // unique or not. If the number is unique, then it is stored in the array `uniquenos`.
        for(int q = m; q <= n; q++)
        {
            if(unique(q))
            {
                uniquenos[c++] = q;
            }
        }
        System.out.println("The Unique digit integers are: ");
        // This is printing the unique numbers in the array `uniquenos`.
        for(int y = 0; y < c; y++)
        {
            if(uniquenos[y] != 0 && y < c - 1)
            {
                System.out.print(uniquenos[y] +", ");
            }
            else if(uniquenos[y] != 0)
            {
                System.out.println(uniquenos[y]);
            }
        }
        System.out.println("Frequency of Unique digit integers is " + c);
    }
    /**
     * It checks if the range of numbers is valid or not. If the range is valid, then the program will
     * continue, else it will print "Invalid range"
     */
    public void start()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("m = ");
        int from = sc.nextInt();
        System.out.print("n = ");
        int to = sc.nextInt();
        // The below code is checking if the range of numbers is valid or not. If the range is valid,
        // then the program will continue, else it will print "Invalid range".
        boolean valid = (from < 3000 && to < 3000 && from < to && from > 0 && to > 0) ? true : false;
        if(valid)
        {
            check(from, to);
        }
        else
        {
            System.out.println("Invalid range");
        }
    }
    /**
     * The main function is the entry point of the program
     */
    public static void main(String[] args)
    {
        UniqueDigit obj = new UniqueDigit();
        obj.start(); 
    }
}
