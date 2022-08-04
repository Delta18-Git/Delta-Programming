package ClassX.arraysCW;

import java.util.*;
/**
 * Write a program to accept 10 character elements and print the positions of all vowels in the array.
 *
 * @author (Vinaayak Dasika)
 * @version (04/01/2022)
 */
public class linearSearchContact
{
    void main()
    {
        Scanner S = new Scanner(System.in);
        String name[] = new String[5];
        long phone[] = new long[5];
        int flag = 0;
        int checkphn;
        System.out.println("Enter the name followed by phone number in separate lines.");
        for(int i= 0; i < name.length; i++)
        {
            name[i] = S.next();
            phone[i] = S.nextInt();
        }
        System.out.println("Enter the phone number to search name for.");
        checkphn = S.nextInt();
        for(int i = 0; i < name.length; i++)
        {
            if(checkphn == phone[i])
            {
                flag++;
                System.out.println(name[i] + " is the owner of " + phone[i]);
                break;
            }
        }
        if (flag == 0)
            System.out.println("Phone number not found.");
    }
}
