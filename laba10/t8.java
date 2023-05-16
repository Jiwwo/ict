import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static String hit(double x, double y){
        if (((y > 0.25 * x - 1) & y > 1.25 * x - 1 & y > - 4 * x - 18)
                & ((x < -3 & x > -5 & y < 0.5*x + 4.5)
                || (x > -3 & x < 1 & y < sqrt(4-pow(x + 1,2)) + 3)
                ||(x > 1 & x < 4 & y < 0.33*x + 2.67) )){
            return "Точка попала в область первой фигуры\n";
        }else if ((y < x - 2 & y < -4*x +28 & y > -3*x + 14 & y >= 0)
                || (y > -sqrt(4-pow(x - 5,2))&(x <= 5 & x > 3 & (y < -0.5*x + 1.5
                || y > -3*x + 14) || x > 5)&y<=2)){
            return "Точка попала в область второй фигуры\n";
        }else if (((y >= 0.25 * x - 1) & y >= 1.25 * x - 1 & y >= - 4 * x -18)
                & ((x <= -3 & x >= -5 & y <= 0.5*x + 4.5)
                || (x >= -3 & x <= 1 & y <= sqrt(4-pow(x + 1,2)) + 3)
                ||(x >= 1 & x <= 4 & y <= 0.33*x + 2.67) )){
            return "Точка попала на границу первой фигуры";
        }else if ((y <= x - 2 & y <= -4*x +28 & y >= -3*x + 14 & y >= 0)
                || (y >= -sqrt(4-pow(x - 5,2))&(x <= 5 & x > 3 & (y <= -0.5*x + 1.5
                || y >= -3*x + 14) || x >= 5)&y<=2)){
            return "Точка попала на границу второй фигуры";
        }else {
            return "Точка не попала ни в область, ни на границу";
        }
    }
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\t8.txt");
        FileWriter fwr = new FileWriter(file1, true);
        fwr.write("Постановка задачи\n\nПервая фигура\nx  [-9;4]\n"
                +"Первая область\ny > 0.25 * x - 1\ny > 1.25 * x - 1\ny > - 4 * x - 18\ny < 0.5*x + 4.5\n\n"
                +"Вторая область\nx  [-3;1]\ny < sqrt(4-pow(x + 1,2)) + 3\n"
                +"Третяя область\nx  [1;4]\ny < 0.33*x + 2.67\n\n"
                +"\nВторая фигура\nx[-;-]\n"
                +"Первая область\nx[-;-]\ny < x - 2\ny < -4*x +28\ny > -3*x + 14\n\n"
                +"Вторая область\nx[3;5]\ny > -sqrt(4-pow(x - 5,2))\n y > -3*x + 14\n"
                +"Точки для проверки\n\n№1 (0;-2); №2 (-6;-6); №3 (-2;-2); №4 (4;6); №5 (-6;-2)\n\nВЫВОД ДАННЫХ\n\n");
        fwr.write("Для точки №1\n");
        fwr.write(hit(0, -2)+"\n");
        fwr.write("Для точки №2\n");
        fwr.write(hit(-6, -6)+"\n");
        fwr.write("Для точки №3\n");
        fwr.write(hit(-2, -2) + "\n\n");
        fwr.write("Для точки №4\n");
        fwr.write(hit(4, 6) + "\n\n");
        fwr.write("Для точки №5\n");
        fwr.write(hit(-6, -2));
        fwr.flush();
        fwr.close();
    }
}
