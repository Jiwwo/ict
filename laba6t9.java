import static java.lang.Math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double ep1 = 0.01; double ep2 = 0.001; double ep3 = 0.0001; double ep4 = 0.00001; double ep5 = 0.000001; int n = 0;
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double p = sc.nextDouble();
        double y0 = exp(log(x*(p+1))/p)*0.9;
        hueta(ep1, x, y0, p, n);
        hueta(ep2, x, y0, p, n);
        hueta(ep3, x, y0, p, n);
        hueta(ep4, x, y0, p, n);
        hueta(ep5, x, y0, p, n);
    }
    public static void hueta(double ep,double x,double y,double p,double n){
        double y_i = 1/p*((p - 1)*y+x/pow(y, p - 1));
        n++;
        if (abs(y_i - y) > ep) hueta(ep, x, y_i, p, n);
        else System.out.println(ep + ", " + (y_i) + ", " + n);
    }
}
