import java.io.*;
import java.text.DecimalFormat;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\t11.txt");
        FileWriter fwr = new FileWriter(file);
        DecimalFormat dec = new DecimalFormat("#.#");
        fwr.write("Формула z = x^3*sin(y^2) + x^2*y^3,\n" +
                "x: [-3;2]; x+=0.1, y: [-2;1]; y+=0.2\n\n" +
                "\t\t\t\t\t\t\tМатрица значений Z\n\nX/Y\t");
        for (double y = -2; y <= 1; y+=0.2){
            fwr.write(dec.format(y) + "\t");
        }
        fwr.write("\n");
        for (double x = -3; x <= 2; x+=0.1){
            fwr.write(dec.format(x) + "\t");
            for (double y = -2; y <= 1; y+=0.2){
                Double z = pow(x, 3)*sin(pow(y, 2))+pow(x,2)*pow(y, 3);
                fwr.write(dec.format(z) + "\t");
            }
            fwr.write("\n");
        }
        fwr.flush();
        fwr.close();
    }
}
