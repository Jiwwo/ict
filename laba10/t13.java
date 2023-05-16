import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String out = "C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\t133.txt";
        List<double[][]> f1 = readM("C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\t131.txt");
        List<double[]> f2 = readSLAU("C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\t132.txt");
        List<double[]> corrected = new ArrayList<>();
        for (int i = 0; i < f1.size(); i++) {
            double[][] array = f1.get(i);
            double[] array1 = f2.get(i);
            double[] array2 = check(array, array1);
            corrected.add(array2);
        }
        write(out, corrected);
    }
    private static List<double[][]> readM(String file) throws IOException {
        List<double[][]> array1 = new ArrayList<>();
        List<String> line = Files.readAllLines(Paths.get(file));
        int n = Integer.parseInt(line.get(0));
        line.remove(0);
        while (!line.isEmpty()) {
            double[][] matrix = new double[n][n + 1];
            for (int i = 0; i < n; i++) {
                String[] value = line.get(0).split(" ");
                for (int j = 0; j < n + 1; j++) {
                    matrix[i][j] = Double.parseDouble(value[j]);
                }
                line.remove(0);
            }
            array1.add(matrix);
        }
        return array1;
    }
    private static List<double[]> readSLAU(String file) throws IOException {
        List<double[]> arrayS = new ArrayList<>();
        List<String> line = Files.readAllLines(Paths.get(file));
        while (!line.isEmpty()) {
            String[] values = line.get(0).split(" ");
            double[] s = new double[values.length];
            for (int i = 0; i < values.length; i++) {
                s[i] = Double.parseDouble(values[i]);
            }
            arrayS.add(s);
            line.remove(0);
        }
        return arrayS;
    }
    private static double[] check(double[][] array, double[] array1) {
        int n = array.length;
        double[] res = new double[n];
        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < n; j++) {
                sum += array[i][j] * array1[j];
            }
            res[i] = sum;
        }
        boolean f = true;
        for (int i = 0; i < n; i++) {
            if (Math.abs(res[i] - array[i][n]) > 1e-6) {
                f = false;
                break;
            }
        }
        return f ? array1 : res;
    }
    private static void write(String file, List<double[]> resh) throws IOException {
        try (BufferedWriter fwr = new BufferedWriter(new FileWriter(file))) {
            for (double[] array1 : resh) {
                for (int i = 0; i < array1.length; i++) {
                    fwr.write(Double.toString(array1[i]));
                    if (i < array1.length - 1) {
                        fwr.write(" ");
                    }
                }
                fwr.newLine();
            }
        }
    }
}
