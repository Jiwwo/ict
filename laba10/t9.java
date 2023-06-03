import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\allan\\OneDrive\\Рабочий стол\\t9.txt");
        FileWriter fwr = new FileWriter(file, true);
        BufferedReader fread = new BufferedReader(new FileReader(file));
        int c = 2;
        String str = "";
        String [] mas1 = fread.readLine().split("\s");
        String [] mas2 = fread.readLine().split("\s");
        String[][] array = new String[c][10];
        for (int i = 0; i < mas1.length; i++) {
            array[0][i] = mas1[i];
            array[1][i] = mas2[i];
        }
        fwr.write("\n\nВЫВОД\n\n");
        int multiCntF = 0;
        Set<String> rPersom = new HashSet<>();
        Map<String, Integer> fClassCnt = new HashMap<>();
        Map<String, Integer> bClassCnt = new HashMap<>();
        for (String[] row : array) {
            String f = row[8];
            String b = row[1];
            String rPerson = row[9];
            boolean hasMulti = Boolean.parseBoolean(row[4]);
            boolean hasComp = Boolean.parseBoolean(row[5]);
            int compCnt = Integer.parseInt(row[6]);
            int seatCnt = Integer.parseInt(row[3]);
            if (hasMulti && hasComp && compCnt >= 15 && seatCnt >= 30) {
                multiCntF++;
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
