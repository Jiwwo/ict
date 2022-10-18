import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class kekw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("input a");
        a = sc.nextInt();
        System.out.println("input b");
        b = sc.nextInt();
        System.out.println("input c");
        c = sc.nextInt();
        Integer[] arr = {a, b, c};
        Arrays.sort(arr, Collections.reverseOrder());
        for (double values : arr) {
            System.out.print(values + ", ");


        }
    }
}
