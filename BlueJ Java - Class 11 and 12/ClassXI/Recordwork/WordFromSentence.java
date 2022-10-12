package ClassXI.Recordwork;

import java.util.Scanner;

/**
 * Write a description of class WordFromSentence here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordFromSentence
{
    String sentence, word;
    char[] s, w;
    int[] freqs, freqw;
    boolean result;
    int distinct;
    public static void main(String[] args)
    {
        WordFromSentence obj = new WordFromSentence();
        obj.input();
        obj.check();
        obj.output();
    }
    void input()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the sentence.");
        sentence = S.nextLine().toLowerCase();
        System.out.println("Enter the word to form.");
        word = S.next().toLowerCase();
    }
    void check()
    {
        s = new char[sentence.length()];
        w = new char[word.length()];
        s = sentence.toCharArray();
        w = word.toCharArray();
        freqs = new int[sentence.length()];
        freqw = new int[word.length()];
        for (int i = 0; i < s.length; i++)
        {
            freqs[i] = 1;
            for (int j = i + 1; j < s.length; j++)
            {
                if (s[i] == s[j])
                {
                    freqs[i]++;
                    s[j] = '`'; //trash character
                }
                if (s[i] == '`')
                    freqs[i] = 0;
            }
        }
        for (int i = 0; i < w.length; i++)
        {
            freqw[i] = 1;
            for (int j = i + 1; j < w.length; j++)
            {
                if (w[i] == w[j])
                {    
                    freqw[i]++;
                    w[j] = '`'; //trash character
                }
                if (w[i] == '`')
                    freqw[i] = 0;
            }
        }
        for(int i = 0; i < w.length; i++)
        {
            for (int j = 0; j < s.length; j++)
            {
                if(s[j] == w[i] && s[j] != '`')
                {
                    if (freqw[i] <= freqs[j])
                    {    
                        distinct += freqw[i];
                    }
                }
            }
        }
        if (distinct == w.length)
        {
            result = true;
        }
    }
    void output()
    {
        if (result)
            System.out.println(word + " can be formed from: " + sentence + ".");
        else
            System.out.println(word + " can't be formed from: " + sentence + ".");
    }
}
