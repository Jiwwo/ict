import java.time.LocalDate;
import java.time.Period;

class class_c1{
    public static void main(String[] args) {
        String str = "Иванов;Иван;Иванович;м;русский;175;70;1990,01,01;+7(123)456-78-90;123456;Россия;Московская область;Подольск;Пушкина;1;2.Петров;Петр;Петрович;м;украинец;165;55;1985,05,15;+7(123)456-78-91;123457;Украина;Киевская область;Киев;Крещатик;3;4.Сидорова;Анна;Сергеевна;ж;россиянка;170;60;1995,12,31;+7(123)456-78-92;123458;Россия;Московская область;Москва;Тверская;5;6.";
        String[] Data = str.split("\\.");
        int pCnt = 0;
        int yng = Integer.MAX_VALUE;
        String yngData = "";
        for (String pData : Data) {
            String[] data = pData.split(";");
            int h = Integer.parseInt(data[5]);
            int w = Integer.parseInt(data[6]);
            int age = calculateAge(data[7]);
            if (h >= 150 && h <= 180 && w >= 50 && w <= 80) {
                pCnt++;
            }
            if (age < yng) {
                yng = age;
                yngData = pData;
            }
        }
        System.out.println("Количество людей с ростом от 150 до 180 см и весом от 50 до 80 кг: " + pCnt);
        System.out.println("Сведения о самом молодом человеке: " + yngData);
    }
        private static int calculateAge(String date) {
            String[] p = date.split(",");
            int year = Integer.parseInt(p[0]);
            int month = Integer.parseInt(p[1]);
            int day = Integer.parseInt(p[2]);
            LocalDate birth = LocalDate.of(year, month, day);
            LocalDate today = LocalDate.now();
            Period age = Period.between(birth, today);
            return age.getYears();
        }
}
