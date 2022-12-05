import java.util.Scanner;

public class oliver1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input n");
        int n = sc.nextInt();
        int [] arr = new int [n];
        for ( int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }
        int k = 0;
        for (int i = 1; i < n - 1; i++){
            if (arr[i - 1] < arr[i] & arr[i] > arr[i + 1]) k++;
        }
        System.out.println(k);
    }
}
