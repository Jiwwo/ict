import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int [] arr = new int[n];
        getArr(arr);
        int [] arr1 = Arrays.copyOf(arr,n);
        System.out.println(Arrays.toString(arr) + "initial arr");
        System.out.println();
        int temp;
        int i = 1;
        int counter = 0; int counter1 = 0;

        while (i < arr.length){ //Gnomesort
            if (arr[i - 1] <= arr[i]){
                i++;
            }
            else {
                temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
                if(i > 1){
                    i--;
                    counter++;
                    if (counter == 10) System.out.println(Arrays.toString(arr) + "comparison of the Gnome sorting process on the 10th cycle");
                }
            }
        }

        boolean isSorted = false; // Bubblesort
        while (!isSorted) {
            isSorted = true;
            for (int j = 0; j < arr1.length - 1; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                    isSorted = false;
                    counter1++;
                    if (counter1 == 10) System.out.println(Arrays.toString(arr1) + "comparison of the Bubble sorting process on the 10th cycle");
                }
            }
        }
        System.out.println();
        System.out.println("num of iterations in Bubble sort = " + counter1);
        System.out.println();
        System.out.println("num of iterations in Gnome sort = " + counter);
    }
    public static void getArr(int [] arr){
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }
    }
}
