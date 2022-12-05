import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = 0;
        System.out.println("input n");
        int n = in.nextInt();
        double[] list = new double[2 * n];
        Random random = new Random();
        for(int i = 0; i < 2 * n; i++){
            list[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(list));
        System.out.println("input a");
        double a = in.nextDouble();
        System.out.println("input b");
        double b = in.nextDouble();
        for (int i = 0; i < list.length - 1; i += 2){
            if(pow(list[i], 2)/pow(a, 2) + pow(list[i + 1], 2)/pow(b, 2) <= 1){
                c += 1;
                System.out.println("dot №" + c + " is in ellipse");
            }
            else System.out.println("dot №" + c + " isn't in ellipse");
        }
    }
}
