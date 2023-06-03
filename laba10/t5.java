import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\t5.1.txt");
        File file2 = new File("C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\t5.2.txt");
        appendSentences(file1, file2);
    }
    public static void appendSentences(File file1, File file2) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2, true));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] sentences = line.split("[.!?]\\s+");
            for (String sentence : sentences) {
                if (sentence.matches(".*[A-Z][a-z]*\\s+[A-Z]{2,}.*")) {
                    writer.write(sentence + ". ");
                }
            }
        }
    }
}
