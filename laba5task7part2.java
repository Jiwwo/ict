import static java.lang.Math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input x:");
        double x = in.nextDouble();

        if (x >= -4 & x <= 4){
            if(x<=-1)
                System.out.println((1-abs(x))/cbrt(1+x+x*x));
            else if(x < 0)
                System.out.println(2*log(1+x*x)+(1+pow(cos(x),4))/(2-x));
            else
                if (x>1)
                    System.out.println(-pow(abs(1-x),0.6));
                else System.out.println(pow(1-x,0.6));
        }
        else
            System.out.println("clown?");
    }
}
