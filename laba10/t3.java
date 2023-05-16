import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\t3.txt");
        FileWriter fwr = new FileWriter(file1, true);
        BufferedReader fread = new BufferedReader(new FileReader(file1));
        fwr.write("\nOUT\n");
        while (fread.ready()){
            String str = fread.readLine();
            String[] array = str.split("\\s+");
            for (int i = 0; i < array.length; i++) {
                if (array[i].matches("([a-z]*[A-Z])|([а-я]*[А-Я])")) {
                    fwr.write(array[i] + "\n");
                }
            }
        }
        fwr.flush();
        fwr.close();
    }
}

