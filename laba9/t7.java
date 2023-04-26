public class class_c1 {
    public static void main(String[] args) {
        String str = "How many o great Acheles";
        String[] words = str.split(" "); 
        int cnt = 0; 
        for (String word : words) {
            if (word.length() == 3) { 
                cnt++; 
            }
        }
        System.out.println(cnt);
    }
}
