import java.util.*;
import static java.lang.Math.*;
import static java.lang.System.exit;
public class oliver2 {

    public static void main(String[] args) {
        System.out.println("input n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        double result = 0;

        for (int i = 0, j = 1; i < n; i++, j++)
        {
            arr [i] = sc.nextInt();
            if (arr [i] > 6 || arr[i] < 0)
            {
                System.out.println("wrong number");
                exit(0);
            }
            result += arr[i] * pow(6,-j);
        }
        System.out.println(Arrays.toString(arr));
        int len = Double.toString(result).length();
        result *= pow(10, len - 2);
        int[] arr2 = new int[len - 1];

        for (int k = len - 2; k > 0; k--)
        {
            arr2[k] = (int)(result % 10);
            result /= 10;
        }
        for (int l = 0; l < len -5; l++)
        {
            if(arr2[l] == arr2[l + 1] & arr2[l] == arr2[l + 2] & arr2[l] == arr2[l + 3])
            {
                int[] newArr1 = Arrays.copyOfRange(arr2, 1, l + 4);
                System.out.println(Arrays.toString(newArr1));
                exit(0);
            }
        }
        int[] newArr = Arrays.copyOfRange(arr2, 1, arr2.length);
        System.out.println(Arrays.toString(newArr));
    }
}
