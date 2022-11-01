import java.util.Scanner;

public class oliver3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n, p, count = 0, maxdigit = 0;
        n = sc.nextInt();
        while (n != 0) {
            p = n % 10;
            if (p > maxdigit) {
                maxdigit = p;
                count = 0;
            }
            if (p == maxdigit) count++;
            n /= 10;
        }
        System.out.println(count);
    }
}
