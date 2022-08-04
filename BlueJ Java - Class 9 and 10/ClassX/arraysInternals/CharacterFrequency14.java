package ClassX.arraysInternals;

import java.util.*;
/**
 * Write a description of class CharacterFrequency here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class CharacterFrequency14
{
    char array[] = new char[10];
    int count[] = new int[10];
    int frequency;
    void countercheck(int i)
    {
        for(int j = i + 1; j < array.length; j++)
        {
            if (array[i] == array[j])
            {
                frequency++;
                count[j] = -7;
            }
        }
    }
    void main()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter 10 characters to check.");
        for(int a = 0; a < array.length; a++)
        {
            array[a] = S.next().charAt(0);
        }
        for(int i = 0; i < array.length; i++)
        {
            frequency = 1;
            countercheck(i);
            if (count[i] != -7)
                count[i] = frequency;
        }
        for(int b = 0; b < count.length; b++)
        {
            if (count[b] != -7)
                System.out.println("Character: " + array[b] + ", Count: " + count[b]);
        }
    }
}
