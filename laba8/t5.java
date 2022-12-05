import java.util.Scanner;
import java.util.Random;

public class oliver3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int [][] arr = new int[n][n];
        getArr(arr);
        PrintOut(arr);
        System.out.println();
        getNewArr(arr);
        PrintOut(arr);
    }
    public static int getMax(int[] ints){
        int maxIndex = 0;
        int max = 0;
        for (int index = 0; index < ints.length; index++) {
            if (ints[index] > max) {
                max = ints[index];
                maxIndex = index;
            }
        }
        return maxIndex;
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
    public static void getNewArr(int[][] arr){
        int temp;
        int maxId;
        int c = 0;
        for (int[] ints : arr){
            maxId = getMax(ints);
            if (arr[c][maxId] > arr[c][c]){
                temp = arr[c][c];
                arr[c][c] = arr[c][maxId];
                arr[c][maxId] = temp;
            }
            c++;
        }
    }
}
