import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\51.txt");
        File file1 = new File("C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\52.txt");
        FileWriter fwr = new FileWriter(file1, true);
        BufferedReader fread = new BufferedReader(new FileReader(file));
        String str = "(.*[A-Z][a-z]+.*[A-Z]+.*)|(.*[А-Я][а-я]+.*[А-Я]+.*)";
        String line = fread.readLine();
        String [] array = line.split("\\.\\s");
        for (int i = 0; i < array.length; i++){
           if (array[i].matches(str)){
               fwr.write(" " + array[i] + ".");
           }
        }
        fwr.flush();
        fwr.close();
    }
}
