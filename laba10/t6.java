import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileName = "C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\t6.txt";
        int totalServicesCost = 0;
        int totalProductsCost = 0;
        int totalServicesCount = 0;
        int totalProductsCount = 0;
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String type = parts[0].trim();
            int salesCount = Integer.parseInt(parts[2].trim());
            int price = Integer.parseInt(parts[3].trim());
            int cost = salesCount * price;
            if ("услуга".equalsIgnoreCase(type)) {
                totalServicesCost += cost;
                totalServicesCount += salesCount;
            } else if ("продукт".equalsIgnoreCase(type)) {
                totalProductsCost += cost;
                totalProductsCount += salesCount;
            }
        }
        BufferedWriter fwr = new BufferedWriter(new FileWriter(fileName, true));
        fwr.newLine();
        fwr.write("Общие затраты на услуги: " + totalServicesCost);
        fwr.newLine();
        fwr.write("Общие затраты на продукты: " + totalProductsCost);
        fwr.newLine();
        fwr.write("Общее количество приобретенных услуг: " + totalServicesCount);
        fwr.newLine();
        fwr.write("Общее количество приобретенных продуктов: " + totalProductsCount);
        fwr.flush();
        fwr.close();
    }
}

