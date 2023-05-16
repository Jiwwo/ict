import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\t4.txt");
        FileWriter fwr = new FileWriter(file1, true);
        BufferedReader fread = new BufferedReader(new FileReader(file1));
        String regular = "([а-яА-Я]*)|([a-zA-Z]*)|(\\W*)([_.,;:!?])(\\w*)";
        fwr.write("\nOUT\n");
        while (fread.ready()){
            String line = fread.readLine();
            String[] array = line.split("\\s+");
            for (String str : array) {
                if (str.matches(regular)) {
                    fwr.write(str + "\n");
                }
            }
        }
        fwr.flush();
        fwr.close();
    }
}

