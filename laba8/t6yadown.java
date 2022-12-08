import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int[][] arr = new int[2 * n][2 * n];
        int[][] b1 = new int[n][n]; int[][] b2 = new int[n][n]; int[][] b3 = new int[n][n]; int[][] b4 = new int[n][n];
        int i, j, k, m;
        getArr(arr);
        PrintOut(arr);
        System.out.println();
        for(i = 0; i < n; i++)
            for(j = 0; j < n; j++)
                b1[i][j] = arr[i][j];

        for(i = 0; i < n; i++)
            for(j = n, m = 0; j < 2 * n; j++, m++)
                b2[i][m] = arr[i][j];

        for(i = n, k = 0; i < 2 * n; i++, k++)
            for(j = n, m = 0; j < 2 * n; j++, m++)
                b3[k][m] = arr[i][j];

        for(i = n, k = 0; i < 2 * n; i++, k++)
            for(j = 0; j < n; j++)
                b4[k][j] = arr[i][j];

        for(i = 0; i < n; i++)
            for(j = 0; j < n; j++)
                arr[i][j] = b4[i][j];

        for(i = 0; i < n; i++)
            for(j = n, k = 0; j< 2 * n; j++, k++)
                arr[i][j] = b1[i][k];

        for(i = n, k = 0;i < 2 * n; i++, k++)
            for(j = n, m = 0; j < 2 * n; j++, m++)
                arr[i][j] = b2[k][m];

        for(i = n, k = 0; i < 2 * n; i++, k++)
            for(j = 0; j < n; j++)
                arr[i][j] = b3[k][j];
        PrintOut(arr);
    }
    public static void getArr(int [][] arr){
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(10);
            }
        }
    }
    public static void PrintOut(int[][] arr){
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}
