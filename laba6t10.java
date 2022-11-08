import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        double sum;
        double h;
        for(double n = 10;n <= 10000; n *= 10){
            h = 1/n;
            sum = 0;
            for (int i = 0; i < n; i++){
                sum += (cos(pow(n-h*i,2) + 5 * (n-h*i) + 6)+ 5) * h;
            }
            System.out.println(n + "          " + h + "         " + sum + "         5.18" + "       "+ abs(sum - 5.18));
        }

    }
}
