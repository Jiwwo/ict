import static java.lang.Math.*;

public class oliver3 {
    public static void main(String[] args) {
        double sum=1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j<=i; j++){
                sum *= sin(i+j);

            }
        }
        System.out.println(sum);
    }
}
