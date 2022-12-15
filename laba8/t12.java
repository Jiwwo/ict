import java.util.Scanner;
import static java.lang.System.exit;

public class oliver1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int [][] arr = new int[n][n];
        int [][] arr_1 = new int[n][n];
        System.out.println("input elements of array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("input elements of array_1");
        for (int i = 0; i < arr_1.length; i++) {
            for (int j = 0; j < arr_1[i].length; j++) {
                arr_1[i][j] = in.nextInt();
            }
        }
        int [][] e = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                for (int k = 0; k < n; k++){
                    e[i][j] += arr[i][k] * arr_1[k][j];
                }
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i; j++){
                if (e[i][i] != 1 || e[i][j] != 0 || e[n - i - 1][n - 1 - j] != 0) {
                    System.out.println("Wrong input");
                    exit(0);
                }
            }
        }
    }
}
