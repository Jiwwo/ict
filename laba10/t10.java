import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\t10.txt");
        FileWriter fwr = new FileWriter(file1, true);
        Scanner in = new Scanner(System.in);
        double x = 0;
        System.out.println("Введите значение x");
        while (Math.abs(x = in.nextDouble()) >= 2.4){
            System.out.println("Ошибка! Введите другое значение x");
        }
        int k = 0;
        double s = 0;
        for (double ep = 0.0001; ep <= 0.01; ep*=10){
            s = 0;
            k = 0;
            while (Math.abs(Math.exp(x)*(1+x)-s) > ep){
                s += (Math.pow(x,k)*(k + 1))/(factorial1(k));
                k++;
            }
            fwr.write("Функция f(x) = e^x(1 + x) для x = " + x + " равняется " + s + "\n"
                    +"Результаты определения значений функции f(x) = e^x(1 + x) с помощью ряда Маклорена\n"
                    +"Погрешность итерационной процедуры "+ep+"\n"
                    +"Значение функции по Маклорену\t\tПогрешность, %\tЧисло итераций\n"
                    +"\t"+s+"\t\t\t\t"+ep*100+"\t\t\t"+k+"\n\n");
        }
        fwr.flush();
        fwr.close();
    }
    public static int factorial1(int enter1){
        int res1 = 1;
        for (int i = 1; i <= enter1; i ++){
            res1 *= i;
        }
        return res1;
    }
}
