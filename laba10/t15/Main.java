import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{
        String coordinates = "C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\t151.txt";
        String structures = "C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\t152.txt";
        String end = "C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\t153.txt";
        List<String> d1 = load(coordinates);
        List<String> d2 = load(structures);
        BufferedWriter fwr = new BufferedWriter(new FileWriter(end));
        fwr.write("N участка\tПлощадь участка\tКол-во объектов\t% площади участка, которую занимает водоем\t% площади участка, которую занимает ключ");
        fwr.newLine();
        for (int i = 0; i < d1.size(); i++) {
            String str = d1.get(i);
            square ground = square(str);
            int cnt = 0;
            double lakeArea = 0;
            double groundArea = 0;
            for (String obj : d2) {
                String[] parts = obj.split(",");
                String type = parts[0];
                int x = Integer.parseInt(parts[1]);
                int y = Integer.parseInt(parts[2]);
                if (ground.contains(x, y)) {
                    cnt++;
                    if ("lake".equals(type) || "spring".equals(type)) {
                        int radius = Integer.parseInt(parts[3]);
                        double area = Math.PI * radius * radius;
                        double percent = (area / ground.getArea()) * 100;
                        if ("lake".equals(type)) {
                            lakeArea += percent;
                        } else {
                            groundArea += percent;
                        }
                    }
                }
            }
            fwr.write(String.format("%d\t%.2f\t%d\t%.2f\t%.2f", i + 1, ground.getArea(), cnt, lakeArea, groundArea));
            fwr.newLine();
            }
            fwr.flush();
            fwr.close();
    }
    private static List<String> load(String fileName) throws IOException{
        List<String> data = new ArrayList<>();
        BufferedReader rd = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = rd.readLine()) != null) {
            data.add(line);
        }
        return data;
    }
    private static square square(String coordinates) {
        String[] points = coordinates.split(";");
        int[] x = new int[4];
        int[] y = new int[4];
        for (int i = 0; i < points.length; i++) {
            String[] pointC = points[i].split(",");
            x[i] = Integer.parseInt(pointC[0]);
            y[i] = Integer.parseInt(pointC[1]);
        }
        return new square(x, y);
    }
}

class square { // эта мразь отняла у меня 2 часа времени 
    private int[] x1;
    private int[] y1;

    public square(int[] x, int[] y) {
        this.x1 = x;
        this.y1 = y;
    }
    public boolean contains(int x, int y) {
        int minX = Math.min(Math.min(x1[0], x1[1]), Math.min(x1[2], x1[3]));
        int maxX = Math.max(Math.max(x1[0], x1[1]), Math.max(x1[2], x1[3]));
        int minY = Math.min(Math.min(y1[0], y1[1]), Math.min(y1[2], y1[3]));
        int maxY = Math.max(Math.max(y1[0], y1[1]), Math.max(y1[2], y1[3]));
        return x >= minX && x <= maxX && y >= minY && y <= maxY;
    }
    public double getArea() {
        double w = Math.sqrt(Math.pow(x1[0] - x1[1], 2) + Math.pow(y1[0] - y1[1], 2));
        double h = Math.sqrt(Math.pow(x1[1] - x1[2], 2) + Math.pow(y1[1] - y1[2], 2));
        return w * h;
    }
}
