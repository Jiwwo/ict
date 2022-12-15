import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int [][] arr = new int[n][n];
        int k_max = (n * n - n)/2 + n;
        FillTheBlock(arr,0,0,n/2 - 1,n/2 - 1,k_max);
        FillTheBlock(arr,0,n/2,n - 1,n/2 - 1,k_max);
        FillTheBlock(arr,n/2,0,n/2 - 1,n - 1,k_max);
        FillTheBlock(arr,n/2,n/2,n - 1,n - 1,k_max);
        PrintArr(arr);
    }
    public static void FillTheBlock(int [][] arr,int x, int y, int m, int end_x,int k_max){
        int k = 1;
        for (int lp = 0,c = x; lp < m; lp++,c++){
            if (k >= k_max) break;
            for (int i = y + lp; i <= m - lp - 1; i++){
                arr[i][c] = k++;
            }
            for (int l = m - 3 * lp, b = x + 2 * lp; l >= y + lp; l--, b++){
                arr[l][b] = k++;
            }
            for (int h = end_x - 2 * lp - 1,h1 = y + lp; h >= x + 1 + lp ; h--){
                arr[h1][h] = k++;
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
//test / fix 1 loop 
