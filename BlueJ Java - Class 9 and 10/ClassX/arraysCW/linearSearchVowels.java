package ClassX.arraysCW;

import java.util.*;
/**
 * Write a program to accept 10 character elements and print the positions of all vowels in the array.
 *
 * @author (Vinaayak Dasika)
 * @version (04/01/2022)
 */
public class linearSearchVowels
{
    void main()
    {
        Scanner S = new Scanner(System.in);
        char array[] = new char[10];
        int flag = 0;
        System.out.println("Enter the elements of the array.");
        for(int i= 0; i < array.length; i++)
        {
            array[i] = S.next().charAt(0);
        }
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == 'A' || array[i] == 'E' || array[i] == 'I' || array[i] == 'O' || array[i] == 'U' || array[i] == 'a' || array[i] == 'e' || array[i] == 'i'|| array[i] == 'o' || array[i] == 'u')
            {
                flag++;
                System.out.println(array[i] + " is the " + (i+1) + " term.");
            }
        }
        if (flag == 0)
            System.out.println("Vowels not found.");
    }
}
