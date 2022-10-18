import java.util.Scanner;
import static java.lang.Math.*;


public class inflaba4n1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r, h, sb,so,sp;
        System.out.println("exter R");
        r = sc.nextDouble();
        System.out.println("exter h");
        h = sc.nextDouble();
        sb = 2*PI*r*h;
        so = PI*h*(2*r-h);
        sp = sb + so;
        System.out.println("Боковая площадь шщарого сигмента =" + sb);
        System.out.println("Полная площадь шщарого сигмента =" + sp);
    }
}
