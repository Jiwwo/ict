import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class coordinates {
    public static void main(String[] args) throws IOException {
        String file = "C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\t151.txt";
        int n = 10;
        BufferedWriter fwr = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i < n; i++) {
            String ground = generateRandomPlotCoordinates();
            fwr.write(ground);
            fwr.newLine();
        }
        fwr.flush();
        fwr.close();
    }
    private static String generateRandomPlotCoordinates() {
        Random random = new Random();
        StringBuilder coordinates = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int x = random.nextInt(1000);
            int y = random.nextInt(1000);
            coordinates.append(x).append(",").append(y);
            if (i < 3) {
                coordinates.append(";");
            }
        }
        return coordinates.toString();
    }
}
