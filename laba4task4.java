import java.util.Scanner;
import static java.lang.Math.*;


public class inflaba4n1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double G, m1, m2, r, f;
        G = 6.67 * pow(10,-11);
        System.out.println("exter R");
        r = sc.nextDouble();
        System.out.println("exter m1");
        m1 = sc.nextDouble();
        System.out.println("exter m2");
        m2 = sc.nextDouble();
        f = G*m1*m1/pow(r,2);
        System.out.println("F =" + f);


    }
}
