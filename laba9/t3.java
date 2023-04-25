import java.util.Scanner;

public class class_c1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input arrays of symbols");
        String inStr = in.nextLine();

        int LowCaseLetCnt = 0;
        for (int i = 0; i < inStr.length(); i++) {
            if (Character.isLowerCase(inStr.charAt(i)) &&
                    Character.getType(inStr.charAt(i)) == Character.LOWERCASE_LETTER) {
                LowCaseLetCnt++;
            }
        }
        System.out.println("lowcase latin letters: " + LowCaseLetCnt);

        System.out.print("input letter to look for (register insensetive)");
        String a = in.nextLine().toLowerCase();
        boolean letterFound = false;
        for (int i = 0; i < inStr.length(); i++) {
            if (Character.toLowerCase(inStr.charAt(i)) == a.charAt(0)) {
                letterFound = true;
                break;
            }
        }
        System.out.println("letter " + a + (letterFound ? " found" : " not found"));

        boolean b = false;
        int bCnt = 0;
        for (int i = 0; i < inStr.length(); i++) {
            if (inStr.charAt(i) == ',') {
                bCnt++;
                if (bCnt >= 2) {
                    b = true;
                    break;
                }
            }
        }
        System.out.println("2 or more , " + (b ? "found" : "not found"));

        boolean LetPF = false;
        for (int i = 0; i < inStr.length() - 1; i++) {
            if ((inStr.charAt(i) == 'в' && inStr.charAt(i + 1) == 'о') ||
                    (inStr.charAt(i) == 'о' && inStr.charAt(i + 1) == 'в')) {
                LetPF = true;
                break;
        }
        }
        System.out.println("pair of \"во\" or \"ов\" " + (LetPF ? "found" : "not found"));

        boolean DPF = false;
        for (int i = 0; i < inStr.length() - 1; i++) {
            if (Character.isDigit(inStr.charAt(i)) && inStr.charAt(i) == inStr.charAt(i + 1)) {
                DPF = true;
                break;
            }
        }
        System.out.println("pair of even nums " + (DPF ? "found" : "not found"));
            
        
    
        
        boolean cnd = false;
        for (int i = 1; i < inStr.length() - 2; i++) {
            if (Character.isLetter(inStr.charAt(i)) &&
                    Character.toLowerCase(inStr.charAt(i)) == Character.toLowerCase(inStr.charAt(i + 1)) &&
                    Character.isDigit(inStr.charAt(i + 2)) && inStr.charAt(i + 2) == '0') {
                for (int j = i + 3; j < inStr.length() - 1; j++) {
                    if (Character.isLetter(inStr.charAt(j)) &&
                            Character.toLowerCase(inStr.charAt(j)) == Character.toLowerCase(inStr.charAt(j + 1)) &&
                            i < j) {
                        cnd = true;
                        break;
                    }
                }
            }
            if (cnd) {
                System.out.println("yep");
                break;
            }
        }
    }
}
