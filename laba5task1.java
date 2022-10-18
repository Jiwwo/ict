import java.util.Scanner;
import static java.lang.Math.*;

public class kekw {
    public static void main(String[] args) {
        double a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("input a");
        a = sc.nextDouble();
        System.out.println("input b");
        b = sc.nextDouble();
        System.out.println("input c");
        c = sc.nextDouble();
        System.out.println("input d");
        d = sc.nextDouble();
        if (a == d) {
            System.out.println("a == d");
            System.exit(0);
        }
        if (b == d) {
            System.out.println("b == d");
            System.exit(0);
        }
        if (c == d) {
            System.out.println("c == d");
            System.exit(0);
        }
        else {
            double m1 = max(d-a,d-b);
            double m2 = max(d-b,d-c);
            double m3 = max(m1,m2);
            System.out.println("max(d-a,d-b,d-c) = " + m3);
        }

    }
}
