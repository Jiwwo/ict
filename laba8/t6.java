import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int[][] arr = new int[2 * n][2 * n];
        int i, j;
        getArr(arr);
        PrintOut(arr);
        System.out.println();
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++){
                Swap(arr, i, j, i, n + j);
                Swap(arr, i, j, n + i, n + j);
                Swap(arr, i , j, n + i, j);
            }
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
    public static void Swap(int [][] arr, int i, int j, int i2, int j2){
        int temp;
        temp = arr[i][j];
        arr[i][j] = arr[i2][j2];
        arr[i2][j2] = temp;
    }
}
