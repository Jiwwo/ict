import java.util.Scanner;

public class oliver1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double y0;
        System.out.println("input p");
        double p = in.nextDouble();
        System.out.println("input x");
        double x = in.nextDouble();
        System.out.println("input y0");
        while ((y0 = in.nextDouble())>= Math.exp(Math.log((x*(p+1)))/p)){
            System.out.println("wrong");
        }
        int n = 0;
        double y;
        for (double ep = 0.000001; ep <= 0.01; ep/=0.1){
            y = 0;
            while (Math.abs(y - y0) > ep){
                y = (1/p)*((p - 1)*y0+(x/Math.pow(y0, p - 1)));
                y0 = y;
                n++;
            }
            if (Math.abs(y - y0)<=ep){
                System.out.println("Точность " + ep + " Корень  " + y + " Число итераций  " + n);
            }
        }
    }
}
