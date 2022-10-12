package ClassXI.Recordwork;
import java.util.Scanner;

/**
 * Write a description of class LongestWordRecur here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LongestWordRecur
{
    String longestWord(String sentence)
    {
        if (sentence.indexOf(' ') == -1) //Checks if there is only one word
            return sentence;
        String word1 = "";
        if(sentence.indexOf(" ") != -1)
            word1 = sentence.substring(0, sentence.indexOf(" "));
        else
            word1 = sentence.substring(0);
        String temp = sentence.substring(sentence.indexOf(" ") + 1);
        String rest = temp.substring(temp.indexOf(" ") + 1);
        String word2 = longestWord(rest); //Gets recursively longest word in remaining sentence
        if (word1.length() >= word2.length()) //Checks for longer word
            return word1;
        else
            return word2;
    }
    String input()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the sentence.");
        return S.nextLine(); //Returns user input
    }
    void output(String input)
    {
        System.out.println("Longest word is = " + longestWord(input));
    }
    public static void main(String[] args)
    {
        LongestWordRecur obj = new LongestWordRecur();
        obj.output(obj.input());
    }
}