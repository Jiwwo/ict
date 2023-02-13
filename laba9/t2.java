import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input lenght of num");
        int n = in.nextInt();
        char [] charArr = new char [n];
        boolean full = true;
        String num = "";
        while(full){
            System.out.println("input your num");
            num = Integer.toString(in.nextInt(), 10);
            charArr = num.toCharArray();
            full = false;
            if (num.contains("8")||num.contains("9")){
                System.out.println("Wrong unput, try again");
                full = true;
            }
        }
        int decimal = (int) Long.parseUnsignedLong(num, 8);
        String ans = getInBase(decimal);
        char [] charArrAns = ans.toCharArray();
        System.out.println(charArrAns);
    }
    public static String getInBase(int number) {
        StringBuilder num = new StringBuilder();
        while (number > 0) {
            num.insert(0, number % 2);
            number = number / 2;
        }
        return num.toString();
    }
}//zachem massiv ? Arrays.toString(massv) zachem togda ?
