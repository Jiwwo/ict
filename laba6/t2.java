import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; int p; int maxdigit = 0;
        int count = 0;
        n = sc.nextInt();
        while (n > 0) {
            p = n % 10;
            if (p > maxdigit) {
                maxdigit = p;
                count = 0;
            }
            if (p == maxdigit) count++;
            n = n / 10;
        }
        System.out.println(count);
    }
}
