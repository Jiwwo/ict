import java.util.Random;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int[][] arr = new int[2][n];
        getArr(arr);
        PrintArr(arr);
        PrintAns(n,arr);
    }
    public static void getArr( int[][] arr){
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(-10, 10);
            }
        }
    }
    public static void PrintArr( int[][] arr){
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
    public static boolean f1(double x, double y){
        return ((y > -6 * x - 54) & (y > 0.67 * x - 0.67) & (y > 3.67 * x + 14.33)
                & (y < 2 * x + 18) & (y < 0.25 * x + 7.5))&(!((y > 1.4 * x + 9.8) & (y < 6 * x + 42 & y >= 0 & x <= 6)));
    }
    public static boolean f2(double x, double y){
        return ((y > -1.67 * x - 5.33) & (y > 2.5 * x - 9.5) &
                (y < 6 * x + 10) & (y < 0.4 * x + 4.4) || (y > - 0.33 * x - 1 & x >= 3 & x <= 6))&(!((y < x + 2) & (y > - 0.83 * x + 2)));
    }
    public static boolean f1edge (double x, double y){
        return ((y == -6 * x - 54) || (y == 0.67 * x - 0.67) || (y == 3.67 * x + 14.33)
                    || (y == 2 * x + 18) || (y == 0.25 * x + 7.5));
    }
    public static boolean f2edge(double x, double y){
        return (y == -1.67 * x - 5.33) || (y > 2.5 * x - 9.5) ||
                    (y == 6 * x + 10) || (y == 0.4 * x + 4.4) || (y == -0.33 * x - 1 & x >= 3 & x <= 6);
    }
    public static void PrintAns (int n, int[][] arr){
        for (int i = 0; i < n; i++){
            if ((f1(arr[0][i], arr[1][i])&f1edge(arr[0][i], arr[1][i])) || f2(arr[0][i], arr[1][i])&f2edge(arr[0][i], arr[1][i]))
                System.out.println("for x=" + arr[0][i] + " and y=" + arr[1][i] + " ans = 0 \t");
            else if (f1(arr[0][i], arr[1][i]) || f2(arr[0][i], arr[1][i])) {
                System.out.println("for x=" + arr[0][i] + " and y=" + arr[1][i] + " ans = 1 \t");
            }
            else System.out.println("for x=" + arr[0][i] + " and y=" + arr[1][i] + " ans = -1 \t");
        }
    }
}
// fix edges

