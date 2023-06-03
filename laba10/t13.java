import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFile1 = "C:\\Users\\allan\\OneDrive\\Рабочий стол\\t131.txt";
        String inputFile2 = "C:\\Users\\allan\\OneDrive\\Рабочий стол\\t132.txt";
        String outputFile = "C:\\Users\\allan\\OneDrive\\Рабочий стол\\t133.txt";
        double[][][] matrices = Matrix(inputFile1);
        double[][] solutions = Solutions(inputFile2);
        double[][] correctedSolutions = new double[solutions.length][];
        for (int i = 0; i < matrices.length; i++) {
            double[][] matrix = matrices[i];
            double[] solution = solutions[i];
            double[] freeTerms = getFreeTerms(matrix);
            if (check(matrix, solution, freeTerms)) {
                correctedSolutions[i] = solution;
            } else {
                correctedSolutions[i] = solveGauss(matrix);
            }
        }
        writeSolutions(outputFile, correctedSolutions);
    }

    public static double[][][] Matrix(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int k = Integer.parseInt(reader.readLine());
        double[][][] matrices = new double[k][][];
        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(reader.readLine());
            double[][] matrix = new double[n][n + 1];
            for (int j = 0; j < n; j++) {
                String[] line = reader.readLine().split(" ");
                for (int m = 0; m < n + 1; m++) {
                    matrix[j][m] = Double.parseDouble(line[m]);
                }
            }
            matrices[i] = matrix;
        }
        return matrices;
    }

    public static double[][] Solutions(String fileName) throws IOException {
        return Files.lines(Paths.get(fileName))
                .map(line -> Arrays.stream(line.split(" "))
                        .mapToDouble(Double::parseDouble)
                        .toArray())
                .toArray(double[][]::new);
    }

    public static void writeSolutions(String fileName, double[][] solutions) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (double[] solution : solutions) {
            for (int i = 0; i < solution.length; i++) {
                writer.write(Double.toString(solution[i]));
                if (i < solution.length - 1) {
                    writer.write(" ");
                }
            }
            writer.newLine();
        }
    }

    public static double[] getFreeTerms(double[][] matrix) {
        return Arrays.stream(matrix)
                .mapToDouble(row -> row[row.length - 1])
                .toArray();
    }

    public static boolean check(double[][] matrix, double[] solution, double[] freeTerms) {
        int n = matrix.length;
        double epsilon = 1e-6;
        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j] * solution[j];
            }
            if (Math.abs(sum - freeTerms[i]) > epsilon) {
                return false;
            }
        }
        return true;
    }

    public static double[] solveGauss(double[][] matrix) {
        int n = matrix.length;
        double[] solution = new double[n];
        for (int i = 0; i < n; i++) {
            int maxRow = i;
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(matrix[j][i]) > Math.abs(matrix[maxRow][i])) {
                    maxRow = j;
                }
            }
            double[] temp = matrix[i];
            matrix[i] = matrix[maxRow];
            matrix[maxRow] = temp;
            for (int j = i + 1; j < n; j++) {
                double factor = matrix[j][i] / matrix[i][i];
                for (int k = i; k < n + 1; k++) {
                    matrix[j][k] -= factor * matrix[i][k];
                }
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            double sum = 0;
            for (int j = i + 1; j < n; j++) {
                sum += matrix[i][j] * solution[j];
            }
            solution[i] = (matrix[i][n] - sum) / matrix[i][i];
        }
        return solution;
    }
}
