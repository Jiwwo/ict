import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        List<Double> list = new ArrayList<>();
        BufferedReader br = Files.newBufferedReader(Paths.get("C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\Variant_1,11.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            if (str.trim().length() == 0) continue;
            String[] a = str.trim().split("\\s+");
            if (a.length >= 5 && yep(a[4])) {
                list.add(Double.parseDouble(a[4]));
            }
        }
        double min = Collections.min(list);
        double max = Collections.max(list);
        double sum = list.stream().mapToDouble(Double::doubleValue).sum();
        double avg = sum / list.size();
        BufferedWriter bw = Files.newBufferedWriter(Paths.get("C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\Variant_1,11.txt"), StandardOpenOption.APPEND);
        bw.newLine();
        bw.write("Min: " + min + ", Max: " + max + ", Avg: " + avg);
        bw.newLine();
        for (double value : list) {
            double dev = value - avg;
            bw.write("Deviation: " + dev);
            bw.newLine();
        }
    }
    private static boolean yep(String str) {
        if (str == null || !Character.isDigit(str.charAt(0)))
        return false;
        Double.parseDouble(str);
        return true;
    }
}
