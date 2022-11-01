import static java.lang.Math.*;

public class oliver3 {
    public static void main(String[] args) {
        double sum=0;
        for (int i = 1; i <= 8; i++) {
            for (int j =1; j<=8; j++){
                sum += pow(j+2*i-1,2);
            }
        }
        System.out.println(sum);
    }
}
