import static java.lang.Math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double ep1 = 0.0001;
        double ep2 = 0.001;
        double ep3 = 0.01;
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println("ep1 = " + summa(ep1,x));
        System.out.println("ep2 = " + summa(ep2,x));
        System.out.println("ep3 = " + summa(ep3,x));
    }
    public static double summa(double ep,double x){
        double s = 0;
        int n = 1;
        while (abs(log(x) - 2 * s) > ep){
            s += pow(x - 1, n)/(n * pow(x + 1, n));
            n += 2;
        }
        return 2*s;
    }
}
