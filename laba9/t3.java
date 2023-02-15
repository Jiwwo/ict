import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int cnt1 = 0, cnt3 = 0;
            char [] charArr = {'1','v','A','D','n','a','h','u','y','a','?','3','(','}','.','.'};
            Matcher matcher1 = Pattern.compile("[a-z]").matcher(Arrays.toString(charArr));
            while(matcher1.find()) cnt1++;
            System.out.println("Latin chars "+cnt1);
            System.out.println("input symbol");
            String symb = in.nextLine();
            Matcher matcher3 = Pattern.compile(symb).matcher(Arrays.toString(charArr));
            while(matcher3.find()) cnt3++;
            if (cnt3 != 0) System.out.println("Your symbol occur " + cnt3 + " times");
            Matcher matcher2 = Pattern.compile("[.,]").matcher(Arrays.toString(charArr));
            if (matcher2.find()) System.out.println("Arr contains . or , ");
            for (int i = 0; i < charArr.length; i++){
                if (charArr[i] =='(' && (charArr[i + 1] == '}'|| charArr[i + 1] == ']'
                ||charArr[i] =='[' && (charArr[i + 1] == '}'|| charArr[i + 1] == ')')
                ||charArr[i] =='{' && (charArr[i + 1] == ')'|| charArr[i + 1] == ']'))) System.out.println("arr contains " + charArr[i] + charArr[i + 1]);;
            }
            for (int i = 0; i < charArr.length - 1; i++){
                if (charArr[i] == '.' && charArr[i] == charArr[i + 1]
                ||charArr[i] == ',' && charArr[i] == charArr[i + 1]
                ||charArr[i] == '!' && charArr[i] == charArr[i + 1]
                ||charArr[i] == '?' && charArr[i] == charArr[i + 1]
                ||charArr[i] == ':' && charArr[i] == charArr[i + 1]
                ||charArr[i] == ';' && charArr[i] == charArr[i + 1]) System.out.println("arr contains .. or ,, or !! etc.");
            }
            char [] charArr1 = {'1','2','3','4','5','6','7','8'};
            for (int i = 0; i < charArr1.length - 1; i++){
                for(int j = 0; j < charArr1.length - 1; j++){
                    for(int k = 0; k < charArr1.length - 1; k++){
                        if ((charArr1[i] > charArr1[k] && charArr1[i + 1] > charArr1[k]) && (charArr1[j] < charArr1[k] && charArr1[j + 1] < charArr1[k]))
                        System.out.println("i j k that fullfill the condition " + i + " " + j + " " + k);
                    }
                }
            }
        }
    }
}
