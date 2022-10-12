package ClassXI.Recordwork;
import java.util.Scanner;

/**
 * Write a description of class NumberInWords here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumberInWords
{
    int num;
    String str = "";
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a four digit number");
        num = sc.nextInt();
    }
    void thousands()
    {
        int s = num/1000;
        if(num == 0){
            System.out.println("Zero");
            System.exit(0);
        }
        else
        {
            switch(s)
            {
                case 0:
                    str += "";
                    break;
                case 1:
                    str += "One thousand ";
                    break;
                case 2:
                    str += "Two thousand ";
                    break;
                case 3:
                    str += "Three thousand ";
                    break;
                case 4:
                    str += "Four thousand ";
                    break;
                case 5:
                    str += "Five thousand ";
                    break;
                case 6:
                    str += "Six thousand ";
                    break;
                case 7:
                    str += "Seven thousand ";
                    break;
                case 8:
                    str += "Eight thousand ";
                    break;
                case 9:
                    str += "Nine thousand ";
                    break;
                default:
                    System.out.println("Invalid Number");
                    System.exit(0);
            }
            num %= 1000;
        }
    }
    void hundreds()
    {
        int s = num/100;
        switch(s)
        {
            case 0:
                str += "";
                break;
            case 1:
                str += "one hundred and ";
                break;
            case 2:
                str += "two hundred and ";
                break;
            case 3:
                str += "three hundred and ";
                break;
            case 4:
                str += "four hundred and ";
                break;            
            case 5:
                str += "five hundred and ";
                break;
            case 6:
                str += "six hundred and ";
                break;
            case 7:
                str += "seven hundred and ";
                break;
            case 8:
                str += "eight hundred and ";
                break;
            case 9:
                str += "nine hundred and ";
                break;
        }
        num %= 100;
    }
    void tens()
    {
        int s = num/10;
        switch(s)
        {
            case 0:
                str += "";
                break;
            case 2:
                str += "twenty ";
                break;
            case 3:
                str += "thirty ";
                break;
            case 4:
                str += "forty ";
                break;
            case 5:
                str += "fifty ";
                break;
            case 6:
                str += "sixty ";
                break;
            case 7:
                str += "seventy ";
                break;
            case 8:
                str += "eighty ";
                break;
            case 9:
                str += "ninety ";
                break;
            default:
                switch(num)
                {
                    case 10: 
                        str += "ten ";
                        break;
                    case 11: 
                        str += "eleven ";
                        break;
                    case 12: 
                        str += "twelve ";
                        break;
                    case 13: 
                        str += "thirteen ";
                        break;
                    case 14: 
                        str += "fourteen ";
                        break;
                    case 15: 
                        str += "fifteen ";
                        break;
                    case 16: 
                        str += "sixteen ";
                        break;
                    case 17: 
                        str += "seventeen ";
                        break;
                    case 18: 
                        str += "eighteen ";
                        break;
                    case 19: 
                        str += "nineteen ";
                        break;
                }
        }
    }
    void units()
    {
        if(!(num >= 10 && num < 20))
        {
            num %= 10;
            switch(num)
            {
                case 1:
                    str += "one";
                    break;
                case 2:
                    str += "two";
                    break;
                case 3:
                    str += "three";
                    break;
                case 4:
                    str += "four";
                    break;
                case 5:
                    str += "five";
                    break;
                case 6:
                    str += "six";
                    break;
                case 7:
                    str += "seven";
                    break;
                case 8:
                    str += "eight";
                    break;
                case 9:
                    str += "nine";
                    break;
            }
        }
    }
    void answer()
    {
        thousands();
        hundreds();
        tens();
        units();
        System.out.println("Number is: " + str);
    }
    public static void main(){
        NumberInWords obj = new NumberInWords();
        obj.input();
        obj.answer();
    }
}
