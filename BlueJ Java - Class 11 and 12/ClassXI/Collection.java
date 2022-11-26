package ClassXI;

import java.util.Scanner;
/**
 * A class Collection accepts an integer array of 100 numbers and the following methods are defined:
 * 
 * Collection() => Default constructor
 * Collection(int x) => Parameterized constructor which assigns length of array to x
 * void input() => Enter the elements of array
 * void arrange() => Sorts array using standard sorting techniques
 * Collection common(Collection ) => Finds the common elements between current object and referenced object,and returns object with common elements.
 * void display() => Prints all elements of the array
 * 
 * Data Members:
 * len => length of array
 * arr[] => integer array to be used
 * 
 * main() is required.
 *
 * @author (Vinaayak Gopala Dasika)
 * @version (24/11/2022 CE)
 */
class Collection
{
    int len;
    int arr[];
    Collection()
    {
        len = 100;
        arr = new int[len];
    }
    Collection(int x)
    {
        len = x;
        arr = new int[len];
    }
    void input()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + len  + " numbers.");
        for(int inputIndex = 0; inputIndex < len; inputIndex++)
            arr[inputIndex] = input.nextInt();
        input.close();
    }
    void arrange()
    {
        for (int repetition = 0; repetition < arr.length -1; repetition++) 
        {
            for (int index = 0; index < arr.length - repetition - 1; index++) 
            {
                if (arr[index] > arr[index + 1]) 
                {
                    int swapInteger = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = swapInteger;
                }
            }
        }
    }
    Collection common(Collection checkCollection)
    {
        int newLength = (checkCollection.len <= len)  ? checkCollection.len : len;
        Collection commonCollection = new Collection(newLength);
        int count = 0;
        for (int checkObjectIndex = 0; checkObjectIndex < checkCollection.len; checkObjectIndex++)
        {
            for (int currentObjectIndex = 0; currentObjectIndex < len; currentObjectIndex++)
            {
                if (arr[currentObjectIndex] == checkCollection.arr[checkObjectIndex])
                    commonCollection.arr[count++] = arr[currentObjectIndex];
            }
        }
        return commonCollection;
    }
    void display()
    {
        for (int displayCounter = 0; displayCounter < len; displayCounter++)
        {
            System.out.print(arr[displayCounter] + " ");
        }
        System.out.println("");
    }
    void main()
    {
        Collection collectionObject1 = new Collection(100);
        Collection collectionObject2 = new Collection(100);
        System.out.println("Enter array 1.");
        collectionObject1.input();
        System.out.println("Enter array 2.");
        collectionObject2.input();
        collectionObject1.arrange();
        collectionObject2.arrange();
        Collection commonCollectionObject = collectionObject1.common(collectionObject2);
        System.out.println("ARRAY 1:");
        collectionObject1.display();
        System.out.println("ARRAY 2:");
        collectionObject2.display(); 
        System.out.println("COMMON ELEMENTS:");
        commonCollectionObject.display();
    }
}
