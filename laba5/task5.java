import java.util.Scanner;
import static java.lang.Math.*;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        if (((y > 0.25 * x - 1) & y > 1.25 * x - 1 & y > - 4 * x -18)
                & ((x < -3 & x > -5 & y < 0.5*x + 4.5) || (x > -3 & x < 1 & y < sqrt(4-pow(x + 1,2)) + 3)||
        (x > 1 & x < 4 & y < 0.33*x + 2.67) )) System.out.println("1");
        else if ((y < x - 2 & y < -4*x +28 & y > -3*x + 14 & y >= 0) || (y > -sqrt(4-pow(x - 5,2))
                &(x <= 5 & x > 3 & (y < -0.5*x + 1.5 || y > -3*x + 14) || x > 5)&y<=2)) System.out.println("2");
            else System.out.println("no hits");

    }
}
