import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        int k = 1;
        for(int i = 0; i < n/2; i ++){
            for (int j = i * 2, b = i; j < n - i; j++, b++){
                arr[j][b] = k;
                k++;
            }
            for (int j = n - 2 - i * 2; j > i; j--){
                arr[n - 1 - i][j] = k;
                k++;
            }
            for (int j = n - i - 1; j > i * 2; j--){
                arr[j][i] = k;
                k++;
            }
            PrintOut(arr);
            System.out.println();
        }
        PrintOut(arr);
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
