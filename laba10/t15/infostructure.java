import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class infostructure {
    public static void main(String[] args) throws IOException{
        String fileName = "C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\t152.txt";
        int n = 50;
        BufferedWriter fwr = new BufferedWriter(new FileWriter(fileName, true));
        for (int i = 0; i < n; i++) {
            String structure = getStructure();
            fwr.write(structure);
            fwr.newLine();
        }
        fwr.flush();
        fwr.close();
    }
    private static String getStructure() {
        Random random = new Random();
        String[] types = {"lake", "spring", "whatever"};
        String type = types[random.nextInt(types.length)];
        int x = random.nextInt(1000);
        int y = random.nextInt(1000);
        StringBuilder data = new StringBuilder();
        data.append(type).append(",").append(x).append(",").append(y);
        if ("lake".equals(type) || "spring".equals(type)) {
            int radius = random.nextInt(50) + 1;
            data.append(",").append(radius);
        }
        return data.toString();
    }
}
