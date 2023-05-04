import java.util.*;

public class class_c1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input n ");
        int n = in.nextInt();
        in.nextLine();
        String[][] arr = new String[n][11];
        for(int j = 0; j < n; j++){
            for (int i = 0; i < 11; i++) {
                System.out.print("Введите строку " + (i + 1) + ": ");
                arr[j][i] = in.nextLine();
            }
            System.out.println("Вы ввели " + j + 1 + " массив информации");
        }
        int multiCntF = 0;
        Map<String, Integer> fClassCnt = new HashMap<>();
        Map<String, Integer> bClassCnt = new HashMap<>();
        for (String [] array : arr) {
            String[] result = findInfoByKeywords(array, "Адрес", "Корпус", "Номер аудитории", "Тип аудитории", "Количество посадочных мест", "Наличие мультимедийного оборудования",
                    "Наличие компьютеров", "Количество компьютеров", "Принадлежность факультету", "Принадлежность кафедре", "Ответственное лицо");
            Set<String> rPersom = new HashSet<>();
                String f = result[8];
                String b = result[1];
                String rPerson = result[10];
                boolean hasMulti = Boolean.parseBoolean(result[5]);
                boolean hasComp = Boolean.parseBoolean(result[6]);
                int compCnt = Integer.parseInt(result[7]);
                int seatCnt = Integer.parseInt(result[4]);
                if (hasMulti && hasComp && compCnt >= 15 && seatCnt >= 30) {
                    multiCntF++;
                    rPersom.add(rPerson);
                    fClassCnt.put(f, fClassCnt.getOrDefault(f, 0) + 1);
                    bClassCnt.put(b, bClassCnt.getOrDefault(b, 0) + 1);
                }
        }
        System.out.println("Количество компьютерных классов по факультетам с мультимедиа: " + multiCntF);
        System.out.println(fClassCnt);
        System.out.println(bClassCnt);
    }

    public static String[] findInfoByKeywords(String[] arr, String... keywords) {
        List<String> orderedResult = new ArrayList<>();
        for (String keyword : keywords) {
            for (String s : arr) {
                if (s.contains(keyword)) {
                    int index = s.indexOf(keyword) + 1;
                    orderedResult.add(s.substring(index + keyword.length()));
                }
            }
        }
        return String.join("\n", orderedResult).split("\n");
    }
}
