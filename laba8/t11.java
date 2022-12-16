import java.util.*;

import static java.lang.Math.*;

public class oliver1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int [][] arr = new int[2][3 * n];
        getArr(arr);
        double s = 0; double ab; double bc; double ca;
        double [][] ans = new double[3][n];
        for (int j = 0, i = 0; j < 3 * n; j += 3, i++){
            ab = sqrt(pow(arr[0][j] - arr[0][j + 1], 2) + pow(arr[1][j] - arr[1][j + 1], 2));
            bc = sqrt(pow(arr[0][j + 1] - arr[0][j + 2], 2) + pow(arr[1][j + 1] - arr[1][j + 2], 2));
            ca = sqrt(pow(arr[0][j + 2] - arr[0][j], 2) + pow(arr[1][j + 2] - arr[1][j], 2));
            s = 0.5 * abs((arr[0][j] - arr[0][j + 2]) * (arr[1][j + 1] - arr[1][j + 2]) - (arr[0][j + 1] - arr[0][j + 2]) * (arr[1][j] - arr[1][j + 2]));
            if (s == 0){
                ans[0][i] = 0;
                ans[1][i] = 0;
            }
            else {
                ans[0][i] = 1;
                ans[2][i] = s;
            }
            if ((ab == bc & bc == ca) & s != 0) ans[1][i] = 1;
            else if ((ab == bc || bc == ca || ca == ab) & s != 0) ans[1][i] = 3;
            else if ((pow(ab,2) == pow(bc,2) + pow(ca, 2) || pow(bc,2) == pow(ab,2) + pow(ca, 2) || pow(ca,2) == pow(bc,2) + pow(ab, 2)) & s!= 0) ans[1][i] = 2;
            else if (s != 0) ans[1][i] = 4;

        }
        PrintOut(ans);

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (ans[2][i] == ans[2][j] & i != j) System.out.println("area of triangle " + (i + 1) + " equals to triangle " + (j + 1));
            }
        }
    }
    public static void getArr(int [][] arr){
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(10);
            }
        }
    }
    public static void PrintOut(double[][] arr){
        for (double[] ints : arr) {
            for (double anInt : ints) {
                System.out.print((int)anInt + " | \t");
            }
            System.out.println();
        }
    }
}
