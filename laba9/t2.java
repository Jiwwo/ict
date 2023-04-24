import java.util.Scanner;

public class class_c1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        boolean input = false;
        do {
            System.out.print("input num");
            str = in.nextLine();
            input = str.matches("[012]+");
            if (!input) {
                System.out.println("wrong num try again");
            }
        } while (!input);

        int numIn = Integer.parseInt(str, 3);
        String strOut = Integer.toString(numIn, 5);

        System.out.println(strOut);
    }
}
