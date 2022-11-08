import static java.lang.Math.*;
import java.util.Scanner;

public class Main {
    public static class FunctionMy {
        public static double FunctionMy1(double y){
            double m = 1;
            return ((pow(m,2)+2.8*m+0.355)/(cos(2*y) + 3.6));
        }
        public static double FunctionMy2(double y){
            double x = 1, d = 1, a = 1,c = 1;
            return ((pow(cos(y + sqrt(x)),y)+2.4*d*cbrt(y-x))/(pow(exp(1),y)+pow(exp(1),pow(y,x))*sqrt(abs(a+x*pow(c,4)))));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        double sum = 0;
        while (n < 10){
            System.out.println("input y");
            double y = sc.nextDouble();
            sum += FunctionMy.FunctionMy1(y) + FunctionMy.FunctionMy2(y);
            n++;
        }
        System.out.println(sum);
    }
}
//как а главное зачем делать "взаимодействие с классом FunctionMy сделать в виде наследования." ?
