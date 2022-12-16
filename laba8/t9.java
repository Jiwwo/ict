import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int [][] arr = new int[n][n];
        int k_max = (n * n - n)/2 + n;
        FillTheBlock_1(arr,0,0,n/2 - 1);
        FillTheBlock_1(arr,0,n/2,n - 1);
        FillTheBlock_2(arr,n/2, 0,n - 1, n/2 * n/2 ,n/2, n);
        FillTheBlock_2(arr,n/2, n/2,n - 1, n/2 * n/2 ,n, n);
        PrintArr(arr);
    }
    public static void FillTheBlock_1(int [][] arr, int x, int y, int m){
        int k = 1;
        for (int lp = 0,c = x; lp <= m/2; lp++,c += 2){
            for (int i = y + 2 * lp; i <= m; i ++){
                arr[i][c] = k++;
            }
            for (int j = m, j_y = c + 1; j >= y + 2 * lp + 1; j--){
                arr[j][j_y] =k++;
            }
        }
    }
    public static void FillTheBlock_2(int [][] arr,int x, int y, int m, int max, int end_y, int size){ // x = 4 y = 0 m = 7
        int k = 1;int lp = 0;
        while (k < max){
            for (int i = end_y - lp - 1, j = m - lp; i >= y + lp; i--){
                arr[i][j] = k++;
            }
            for (int i = m - lp - 1, j = y + lp; i >= x + lp; i--){
                arr[j][i] = k++;
            }
            for (int i = y + lp + 1, j = x + lp; i < end_y - lp; i++){
                arr[i][j] = k++;
            }
            for (int i = x + lp + 1, j = end_y - lp - 1; i < m - lp; i++){
                arr[j][i] = k++;
            }
            lp++;
            if ((size/2) % 2 != 0){
                arr[y + lp][x + lp] = max;
            }
        }
    }
    public static void PrintArr(int[][] arr){
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}
