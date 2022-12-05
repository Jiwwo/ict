public class oliver1 {
    public static void main(String[] args){
        String[][] table = tableArray(9, 9);
        StringBuilder tableF = new StringBuilder();

        for (int line = 0; line < table.length; line++){
            for (int column = 0; column < table[line].length; column++){
                tableF.append(line + 1).append(" + ").append(column + 1).append(" = ").append(table[line][column]).append("\t");
            }
            System.out.println(tableF);
            tableF = new StringBuilder();
        }
    }

    public static String[][] tableArray(int lines, int columns){
        String[][] tableCount = new String[lines][columns];
        for (int line = 0; line < tableCount.length; line++){
            for (int column = 0; column < tableCount[line].length; column++){
                tableCount[line][column] = String.valueOf((line + 1)+(column + 1));
            }
        }
        return tableCount;
    }
}
