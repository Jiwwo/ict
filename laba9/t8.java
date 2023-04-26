class class_c1{
    public static void main(String[] args) {
        String str = "This is the first sentence. This is the second sentence. Third without similar ones. And that is fourth one ";
        String[] sent = str.split("(?<=[.!?])\s+");
        String[] words1 = sent[0].split("\s+");
        String[] words2 = sent[1].split("\s+");
        String result = "";
        for (String word1 : words1) {
            for (String word2 : words2) {
                if (word1.equalsIgnoreCase(word2)) {
                    result += sent[0] + " " + sent[1];
                    break;
                }
            }
            if (!result.isEmpty()) {
                break;
            }
        }
        if (result.isEmpty()) {
            result = "Не найдено двух предложений с общими словами.";
        }
        System.out.println(result);
    }
}
