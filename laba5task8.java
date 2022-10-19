import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input day of the week");
        String a = in.nextLine();
        switch (a) {
            case "Monday" -> System.out.println("urokov net idi rabotat'");
            case "Tuesday" -> System.out.println("urokov net idi rabotat'");
            case "Wednesday" -> System.out.println("urokov net idi rabotat'");
            case "Thursday" -> System.out.println("urokov net idi rabotat'");
            case "Friday" -> System.out.println("urokov net idi rabotat'");
            case "Saturday" -> System.out.println("urokov net idi rabotat'");
            case "Sunday" -> System.out.println("urokov net idi rabotat'");
        }
    }
}
