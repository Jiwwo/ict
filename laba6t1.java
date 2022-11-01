import java.util.Scanner;
import static java.lang.Math.*;

public class oliver3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double n = sc.nextDouble();
        double x = sc.nextDouble();
        double sum1 = 0;
        double sum2 = 0;
        double i = 0;
        while (i < n){
            sum1 += pow(-1,n-1)*(pow(x-1,2*n-1))/getFactorial(2*n-1);
            i += 2;
        }
        while (n > 1){
            if (pow(-1,n-1)*(pow(x-1,2*n-1))/getFactorial(2*n-1) < m)
                sum2 += (pow(-1,n-1)*(pow(x-1,2*n-1))/getFactorial(2*n-1));
            n -= 2;
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }

    public static double getFactorial(double f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return f * getFactorial(f - 1);
        }
    }
}
