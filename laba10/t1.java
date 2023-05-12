import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\ivanx\\OneDrive\\Рабочий стол\\t1.txt");
        FileWriter fwr = new FileWriter(file, true);
        BufferedReader br = new BufferedReader(new FileReader(file));
        fwr.write("\n");
        String inStr = br.readLine();
        int LowCaseLetCnt = 0;
        for (int i = 0; i < inStr.length(); i++) {
            if (Character.isLowerCase(inStr.charAt(i)) &&
                    Character.getType(inStr.charAt(i)) == Character.LOWERCASE_LETTER) {
                LowCaseLetCnt++;
            }
        }
        fwr.write("lowcase latin letters: " + LowCaseLetCnt + "\n");
        String a = "a";
        boolean letterFound = false;
        for (int i = 0; i < inStr.length(); i++) {
            if (Character.toLowerCase(inStr.charAt(i)) == a.charAt(0)) {
                letterFound = true;
                break;
            }
        }
        fwr.write("letter " + a + (letterFound ? " found \n" : " not found \n"));
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
        fwr.write("2 or more , " + (b ? "found \n" : "not found \n"));
        boolean LetPF = false;
        for (int i = 0; i < inStr.length() - 1; i++) {
            if ((inStr.charAt(i) == 'в' && inStr.charAt(i + 1) == 'о') ||
                    (inStr.charAt(i) == 'о' && inStr.charAt(i + 1) == 'в')) {
                LetPF = true;
                break;
            }
        }
        fwr.write("pair of \"во\" or \"ов\" " + (LetPF ? "found \n" : "not found \n"));
        boolean DPF = false;
        for (int i = 0; i < inStr.length() - 1; i++) {
            if (Character.isDigit(inStr.charAt(i)) && inStr.charAt(i) == inStr.charAt(i + 1)) {
                DPF = true;
                break;
            }            
        }
        fwr.write("pair of even nums " + (DPF ? "found \n" : "not found \n"));    
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
                fwr.write("yep \n");
                break;
            }
            else {
            fwr.write("not yep (");
            break;
            }
        }
        fwr.flush();
        fwr.close();
    }
}
