package ClassXI;

import java.util.Scanner;
import java.util.StringTokenizer;
/**
 * A class MyString has been defined for the following methods:
 * MyString() => Constructor
 * void readStream() => Reads String
 * int code(int index) => Returns ASCII code for a character at a given index number.
 * void word() => Displays longest word(s) in String
 * 
 * Data Members:
 * str => input String
 * len => length of str
 *
 * main() is required.
 * 
 * @author (Vinaayak Gopala Dasika)
 * @version (24/11/2022 CE)
 */
class MyString
{
    String str;
    int len;
    MyString()
    {
        str = "";
        len = 0;
    }

    void readStream()
    {
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter a sentence.");
        str = inputObject.nextLine().trim();
        str += " ";
        len = str.length();
        inputObject.close();
    }

    int code(int index)
    {
        try
        {
            return str.charAt(index);
        }
        catch(StringIndexOutOfBoundsException stringIndexOutOfBoundsExceptionObject)
        {
            System.out.println("String index out of bounds.");
            return -1;
        }
    }

    void word()
    {
        String[] wordArray = new String[new StringTokenizer(str).countTokens()];
        String extractedWord = "";
        String lowercaseSentence = str.toLowerCase();
        int wordIndex = 0;
        for (int i = 0; i < len; i++)
        {
            char extractedChar = lowercaseSentence.charAt(i);
            if (extractedChar != ' ')
            {
                extractedWord += extractedChar;
            }
            else
            {
                wordArray[wordIndex] = extractedWord;
                wordIndex++;
                extractedWord = "";
            }
        }
        for (int repetition = 0; repetition < wordArray.length - 1; repetition++) 
        {
            for (int index = 0; index < wordArray.length - repetition - 1; index++) 
            {

                if (wordArray[index].length() > wordArray[index + 1].length()) 
                {
                    String swapString = wordArray[index];
                    wordArray[index] = wordArray[index + 1];
                    wordArray[index + 1] = swapString;
                }
            }
        }
        System.out.println("LONGEST WORD(S): \n" + wordArray[wordArray.length - 1]);
        for (int sameLengthCounter = wordArray.length - 1; sameLengthCounter > 0; sameLengthCounter--) 
        {
            if (wordArray[sameLengthCounter].length() == wordArray[sameLengthCounter - 1].length())
            {
                System.out.println(wordArray[sameLengthCounter - 1]);
            }
        }
    }

    void main(int index1, int index2)
    {
        MyString myStringObject = new MyString();
        myStringObject.readStream();
        myStringObject.word();
        System.out.println("ASCII CODE at index 5 = " + myStringObject.code(index1));
        System.out.println("ASCII CODE at index 792 = " + ((myStringObject.code(index2) != -1) ? myStringObject.code(index2) : "null"));
    }

}
