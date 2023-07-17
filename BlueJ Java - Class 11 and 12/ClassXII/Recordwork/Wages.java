package ClassXII.Recordwork;


/**
 * Write a description of class Wages here.
 *
 * @author Vinaayak Gopala Dasika
 * @version 7/6/2023
 */
public class Wages extends Worker
{
    int hrs;
    double rate;
    double wage;
    double overtime;
    Wages() {
        super();
        hrs = 0;
        rate = 0;
        wage = 0;
        overtime = 0;
    }
    Wages(String n, int b, int h, double r, double o) {
        super(n, b);
        hrs = h;
        rate = r;
        overtime = o;
    }
}
