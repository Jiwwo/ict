import java.util.Scanner;

public class class_c1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        boolean input = false;
        do {
            System.out.print("Введите число в троичной системе счисления: ");
            str = in.nextLine();
            input = str.matches("[012]+");
            if (!input) {
                System.out.println("Число введено неверно. Попробуйте еще раз.");
            }
        } while (!input);

        int inputNumber = Integer.parseInt(str, 3);
        String outputString = Integer.toString(inputNumber, 5);

        System.out.println("Число в пятеричной системе счисления: " + outputString);
    }
}
