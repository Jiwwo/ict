import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\t7.txt");
        FileWriter fwr = new FileWriter(file1);
        fwr.write("Постановка задачи\n\nx >= -3 && x <= 3; x += 0.5\nесли x <= -1, то f(x) = cos(x) - sin(x)\nиначе f(x) = tan(x)\n\nВЫВОД\n\n"
                +"Функция\t\s\s\s\sЗначение f(x)\n\n");
        DecimalFormat d = new DecimalFormat("#.#");
        double x = -3;
        while (x <= 3){
            if (x <= -1) fwr.write( "f(" + x + ")\t=\t" + d.format(cos(x) - sin(x)) + "\n");
            else fwr.write("f(" + x + ")\t=\t" + d.format(tan(x)) + "\n");
            x += 0.5;
        }
        fwr.flush();
        fwr.close();
    }
}

