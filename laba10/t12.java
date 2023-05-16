import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\t12.txt");
        FileWriter fwr = new FileWriter(file1, true);
        BufferedReader fread = new BufferedReader(new FileReader(file1));
        String text = fread.readLine();
        if (!text.contains("/")) {
            System.out.println("text doesn't contains any coments");
            System.exit(0);
        }
        text = text.replaceAll("//.*?;", "");
        Pattern pattern = Pattern.compile("/\\*.*?\\*/", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(text);
        text = matcher.replaceAll("");
        text = text.replaceAll("/\\*\\*.*?\\*/", "");
        fwr.write("\n OUT \n");
        if (text.trim().isEmpty()) {
            fwr.write("no any symbols besides coments");
        } else {
            fwr.write(text);
        }
        fwr.flush();
        fwr.close();
    }
}
