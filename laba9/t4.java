import java.util.ArrayList;

public class class_c1 {
    public static void main(String[] args) {
        char[][] array = { 
                            {'1', '-', '5', '=', '8'}, 
                            {'6', '-', '4', '=', '2'}, 
                            {'3', '-', '9', '=', '7'} 
                          };
        ArrayList<String> incorrect = new ArrayList<>();
        ArrayList<String> correct = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] >= '0' && array[i][j] <= '9') { 
                    int num1 = array[i][j] - '0'; 
                    if (j + 2 < array[i].length && array[i][j + 1] == '-' &&
                        (array[i][j + 2] == '4' || array[i][j + 2] == '5') &&
                        j + 4 < array[i].length && array[i][j + 3] == '=' &&
                        array[i][j + 4] >= '0' && array[i][j + 4] <= '9') { 
                        int num2 = array[i][j + 2] - '0'; 
                        int result = array[i][j + 4] - '0';
                        if (num1 - num2 == result) { 
                            correct.add(num1 + " - " + num2 + " = " + result);
                        } else {
                            incorrect.add(num1 + " - " + num2 + " = " + result);
                        }
                    }
                }
            }
        }
        System.out.println("Incorrect expressions:");
        for (String expression : incorrect) {
            System.out.println(expression);
        }
        System.out.println("Correct expressions:");
        for (String expression : correct) {
            System.out.println(expression);
        }
    }
}
