import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number");
        int number = sc.nextInt();
        boolean ans = getAns();
        while (ans) {
            int ans1 = Integer.parseInt(getInBase(number));
            System.out.println(ans1);
            ans = getAns();
        }
    }
    public static String getInBase(int number) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input base");
        int base = sc.nextInt();
        if (base < 2 || base >= 11 || number < 0) {
            throw new IllegalArgumentException();
        }
        StringBuilder num = new StringBuilder();
        while (number > 0) {
            num.insert(0, number % base);
            number = number / base;
        }
        return num.toString();
    }
    public static boolean getAns(){
        System.out.println("change the scale? type: true or false");
        Scanner sc = new Scanner(System.in);
        return sc.nextBoolean();
    }
}
