import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\t2.txt");
        FileWriter fwr = new FileWriter(file1);
        String[][] array = table(9, 9);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                sb.append(i + 1).append(" + ").append(j + 1).append(" = ").append(array[i][j]).append("\t");
            }
            fwr.write(String.valueOf(sb) + "\n");
            sb = new StringBuilder();
        }
    }
    public static String[][] table(int lines, int columns){
        String[][] array = new String[lines][columns];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = String.valueOf((i + 1)+(j + 1));
            }
        }
        return array;
    }
}
