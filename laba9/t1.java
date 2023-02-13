import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("input the line");
        String str = in.nextLine();
        char [] charArr = str.toCharArray();
        for(int i = 0; i < charArr.length; i++){
            if(Character.isLowerCase(charArr[i])){
                charArr[i] = Character.toUpperCase(charArr[i]);
            } else {
                charArr[i] = Character.toLowerCase(charArr[i]);
            }
            if(Character.isDigit(charArr[i])) charArr[i] = '!';
        }   
        System.out.println(charArr);
    }
}
 
