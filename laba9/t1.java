import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class class_c1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input array of symbols");
        String str = in.nextLine();

        Map<Character, Integer> cnt = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (Character.getType(a) == Character.CONNECTOR_PUNCTUATION ||
                    Character.getType(a) == Character.END_PUNCTUATION ||
                    Character.getType(a) == Character.FINAL_QUOTE_PUNCTUATION ||
                    Character.getType(a) == Character.INITIAL_QUOTE_PUNCTUATION ||
                    Character.getType(a) == Character.OTHER_PUNCTUATION ||
                    Character.getType(a) == Character.START_PUNCTUATION) {
                cnt.merge(a, 1, Integer::sum);
            }
        }
        for (Map.Entry<Character, Integer> entry : cnt.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
