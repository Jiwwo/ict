import java.util.Arrays;

public class class_c1 {
    public static void main(String[] args) {
        String[] strings = {" everybody ", "  everybody  ", "  go to hell  "};
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].trim();
        }
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].replaceAll("o", "a");
        }
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].replaceAll("\s", "-");
        }
        System.out.println(Arrays.toString(strings));
    }
}
