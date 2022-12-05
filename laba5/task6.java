import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        if (y<sqrt(36-x*x) & y >= 0)
            if ((y<3*x+12 & y<-0.75*x+0.75) || (y<x-1 & x<4) ||
                    ((1 > pow(x+2,2)+pow(y-4,2))) || (4 > pow(x-1,2)+pow(y-3,2)
                    & 1 < pow(y-2,2) + pow(x-1,2))) System.out.println("ne popali");
            else System.out.println("popali");
        else System.out.println("ne popali");

    }
}
