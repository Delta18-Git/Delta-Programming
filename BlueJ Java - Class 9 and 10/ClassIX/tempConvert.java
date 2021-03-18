import java.util.*;
/**
 * Uses switch case for making a menu-drive program to convert from F to C or C to F.
 *
 * @author (Vinaayak G Dasika)
 * @version (2/12/12,2020 HE);
 */
public class tempConvert
{
    int sw; double temp, res;
    Scanner Sys = new Scanner(System.in);
    void main()
    {
        System.out.println("Choose from the following\n1. Celsius to Farenheit\n2. Farenheit to Celsius"); //tell user to choose from menu
        sw = Sys.nextInt(); //Input for menu
        System.out.println("Enter the value to be converted."); //tell user to enter a temp to be converted in unit from above
        temp = Sys.nextDouble(); //Input for temp
        switch(sw)
        {
            case 1: res = ctof(temp); //Converts temp to farenheit
            break;
            case 2: res = ftoc(temp); //converts temp to celsius
            break;
            default: System.out.println("Unknown value specified for menu"); System.exit(1);
        }
        System.out.println("The converted temperature is " + res + " degrees."); //Gives output to user
    }

    double ctof(double c) //converts from celsius to farenheit
    {
        double f = 1.8 * c + 32.0;
        return f;
    }

    double ftoc(double f) //converts from farenheit to celsius
    {
        double c = (f-32.0) * 5.0/9.0;
        return c;
    }
}
