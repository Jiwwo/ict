import java.util.Scanner;
import static java.lang.Math.*;


public class inflaba4n1 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3, y, x;
        x1 = getNum();
        y1 = getNum();
        x2 = getNum();
        y2 = getNum();
        x3 = getNum();
        y3 = getNum();
        x = getProjectionX(x1, x2, y1, y2, x3, y3);
        y = getProjectionY(x1, x2, y1, y2, x3, y3);
        System.out.println(x);
        System.out.println(y);
    }

    public static double getProjectionY(double x1, double x2, double y1, double y2, double x3, double y3) {
        double abx = x1 - x2;
        double aby = y1 - y2;
        double dacab = (x3 - x2) * abx + (y3 - y2) * aby;
        double dab = pow(abx,2) + pow(aby,2);
        double t = dacab / dab;
        return y2 + aby * t;
    }

    public static double getProjectionX(double x1, double x2, double y1, double y2, double x3, double y3) {
        double abx = x1 - x2;
        double aby = y1 - y2;
        double dacab = (x3 - x2) * abx + (y3 - y2) * aby;
        double dab = pow(abx,2) + pow(aby,2);
        double t = dacab / dab;
        return x2 + abx * t;
    }

    public static double getNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввидите переменную");
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            return getNum();
        }
    }
}
