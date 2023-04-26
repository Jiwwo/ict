import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class class_c1 {
    public static void main(String[] args) {
        String text = "txt // one string coment ; /* multi string coment */ /** documentary coment */";
        if (!text.contains("/")) {
            System.out.println("text doesn't contains any coments");
            System.exit(0);
        }
        text = text.replaceAll("//.*?;", "");
        Pattern pattern = Pattern.compile("/\\*.*?\\*/", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(text);
        text = matcher.replaceAll("");
        text = text.replaceAll("/\\*\\*.*?\\*/", "");
        if (text.trim().isEmpty()) {
            System.out.println("no any symbols besides coments");
        } else {
            System.out.println(text);
        }
    }
}
