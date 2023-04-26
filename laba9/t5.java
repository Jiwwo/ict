import java.util.Arrays;

public class class_c1 {
    public static void main(String[] args) {
        String str = "ALLA Allah alonA";
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        for (int i = 0; i < words.length; i++) {
            if (words[i].charAt(0) == 'A' & words[i].charAt(words[i].length()-1) == 'A') {
                words[i] = words[i].toLowerCase();
            }
        }
        String formated = String.join(" ", words);
        System.out.println(formated);
    }
}
