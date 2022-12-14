import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int [][] arr = new int[n][n];
        FillTheBlock(arr,0,0,n/2 - 1,n/2 - 1);
        FillTheBlock(arr,0,n/2,n - 1,n/2 - 1);
        FillTheBlock(arr,n/2,0,n/2 - 1,n - 1);
        FillTheBlock(arr,n/2,n/2,n - 1,n - 1);
        PrintArr(arr);
    }
    public static void FillTheBlock(int [][] arr,int x, int y, int m, int end_x){
        int k = 1;
        for (int lp = 0,c = x; lp < m; lp++,c++){
            for (int i = y + lp; i < m - lp; i++){
                arr[i][c] = k++;
                PrintArr(arr);
                System.out.println("======================== 1");
            }
            for (int l = m - 3 * lp, b = x + 2 * lp; l >= y + lp; l--, b++){
                arr[l][b] = k++;
                PrintArr(arr);
                System.out.println("======================== 2");
            }
            for (int h = end_x - 3 * lp - 1,h1 = y + lp; h >= x + 1 ; h--){
                arr[h1][h] = k++;
                PrintArr(arr);
                System.out.println("======================== 3");
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
//test varik
