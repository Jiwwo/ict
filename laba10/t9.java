import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\t9.txt");
        FileWriter fwr = new FileWriter(file, true);
        BufferedReader fread = new BufferedReader(new FileReader(file));
        BufferedReader fread2 = new BufferedReader(new FileReader(file));
        int c = 0;
        while (fread2.ready()) {
            fread2.readLine();
            c ++;
        }
        String[][] array = new String[c][13];
        int i = 0;
        while(fread.ready()) {
            String line = fread.readLine();
            String[] mas = line.split(";");
            array[i][0] = mas[0];
            array[i][1] = mas[1];
            array[i][2] = mas[2];
            array[i][3] = mas[3];
            array[i][4] = mas[4];
            array[i][5] = mas[5];
            array[i][6] = mas[6];
            array[i][7] = mas[7];
            array[i][8] = mas[8];
            array[i][9] = mas[9];
            array[i][10] = mas[10];
            i++;
        }
        fwr.write("\n\nВЫВОД\n\n");
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
        fwr.write("Количество компьютерных классов по факультетам с мультимедиа: " + multiCntF + "\n");
        fwr.write("fClassCnt: " + fClassCnt.toString() + "\n");
        fwr.write("bClassCnt: " + bClassCnt.toString() + "\n");
        fwr.flush();
        fwr.close();
    }
}
