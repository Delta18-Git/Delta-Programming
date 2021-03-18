import java.io.*;
/**
 * Convert temperature in centigrade to farenheit.
 *
 * @author (Vinaayak G Dasika)
 * @version (10/7/2020)
 */
public class cTof
{
    double temp;
    double f;
    public void main(double temperature_in_centigrade)
    {
        temp=temperature_in_centigrade;
        f = temp*(9.0/5.0)+32.0;
        System.out.println("The temperature in Farenheit is " + f + "°F"); 
    }
}
