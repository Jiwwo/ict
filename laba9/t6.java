import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

class test{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        String[][] array = new String[n][11];
        in.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Введите информацию о " + (i+1) + "-м элементе массива:");
            System.out.print("Адрес: ");
            array[i][0] = in.nextLine();
            System.out.print("Корпус: ");
            array[i][1] = in.nextLine();
            System.out.print("Номер аудитории: ");
            array[i][2] = in.nextLine();
            System.out.print("Тип аудитории: ");
            array[i][3] = in.nextLine();
            System.out.print("Количество посадочных мест: ");
            array[i][4] = in.nextLine();
            System.out.print("Наличие мультимедийного оборудования(true/false): ");
            array[i][5] = in.nextLine();
            System.out.print("Наличие компьютеров(true/false): ");
            array[i][6] = in.nextLine();
            System.out.print("Количество компьютеров: ");
            array[i][7] = in.nextLine();
            System.out.print("Принадлежность факультету: ");
            array[i][8] = in.nextLine();
            System.out.print("Принадлежность кафедре: ");
            array[i][9] = in.nextLine();
            System.out.print("Ответственное лицо: ");
            array[i][10] = in.nextLine();
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Информация о " + (i+1) + "-м элементе массива:");
            System.out.println("Адрес: " + array[i][0]);
            System.out.println("Корпус: " + array[i][1]);
            System.out.println("Номер аудитории: " + array[i][2]);
            System.out.println("Тип аудитории: " + array[i][3]);
            System.out.println("Количество посадочных мест: " + array[i][4]);
            System.out.println("Наличие мультимедийного оборудования(да/нет): " + array[i][5]);
            System.out.println("Наличие компьютеров(да/нет):" + array[i][6]);
            System.out.println("Количество компьютеров:  " + array[i][7]);
            System.out.println("Принадлежность факультету: " + array[i][8]);
            System.out.println("Принадлежность кафедре: " + array[i][9]);
            System.out.println("Ответственное лицо: " + array[i][10]);
            System.out.println();
        }
        int multiCntF = 0;
        int multiCntB = 0;
        Set<String> rPersom = new HashSet<>();
        Map<String, Integer> fClassCnt = new HashMap<>();
        Map<String, Integer> bClassCnt = new HashMap<>();
        for (String[] row : array) {
            String f = row[8];
            String b = row[1];
            String rPerson = row[10];
            boolean hasMulti = Boolean.parseBoolean(row[5]);
            boolean hasComp = Boolean.parseBoolean(row[6]);
            int compCnt = Integer.parseInt(row[7]);
            int seatCnt = Integer.parseInt(row[4]);
            if (hasMulti && hasComp && compCnt >= 15 && seatCnt >= 30) {
                multiCntF++;
                multiCntB++;
                rPersom.add(rPerson);
                fClassCnt.put(f, fClassCnt.getOrDefault(f, 0) + 1);
                bClassCnt.put(b, bClassCnt.getOrDefault(b, 0) + 1);
    }
}
        System.out.println("Количество компьютерных классов по факультетам с мультимедиа: " + multiCntF);
        System.out.println(fClassCnt);
        System.out.println(bClassCnt);
    }
}
