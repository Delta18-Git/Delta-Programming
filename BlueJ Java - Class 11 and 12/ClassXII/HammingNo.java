package ClassXII;
import java.util.Scanner;
public class HammingNo {
    int num = 0;
    void input() {
        System.out.print("ENTER ANY NUMBER: ");
        Scanner sysIn = new Scanner(System.in);
        num = sysIn.nextInt();
        sysIn.close();
    }
    void primeFactors() {
        int copy = num;
        int[] factors = new int[num];
        int k = 0;
        String out = (copy + " = ");
        for(int i = 2; i <= num/2; i++) {
            while(copy % i == 0) {
                copy /= i;
                out += i + " * ";
                factors[k++] = i;
            }
        }
        out = out.substring(0, out.length() - 3);
        System.out.println(out);
        boolean check = true;
        for(int i = 0; i < k; i++) {
            if(factors[i] != 2 && factors[i] != 3 && factors[i] != 5) {
                check = false;
                break;
            }
        }
        System.out.print(num + " IS ");
        if(!check) {
            System.out.print("NOT ");
        }
        System.out.println("A HAMMING NUMBER.");
    }
    void positiveCheck() {
        if(num < 0) {
            System.out.println("NEGATIVE NUMBER ENTERED. INVALID INPUT.");
            System.exit(1);
        }
    }
    public static void main(String[] args) {
        HammingNo obj = new HammingNo();
        obj.input();
        obj.positiveCheck();
        obj.primeFactors();
    }
}
