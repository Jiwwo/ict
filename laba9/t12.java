class class_c1{
    public static void main(String[] args) {
        String text = "Привет учитель! Это самое, что я просто хотел написать тебе письмо, в общем случае, чтобы рассказать о своих успехах в школе. Прямо скажу, что последнее время мне стало интересно учиться, а не просто отсиживаться на уроках. Шо я понял, это то, что нужно просто работать над собой и не бояться задавать вопросы. Чео касается моих успехов, то я уверен, что они не просто случайность. Чо до оценок, то я стараюсь получать только хорошие, и для этого учусь каждый день. В общем, хотел поблагодарить тебя за твою помощь и поддержку. Чео до встречи!";
        String[] wordsToRemove = {"это самое", "просто", "в общем случае", "прямо скажу", "Это самое, что" , "Просто","В общем", "Прямо скажу"};
        String[] sentences = text.split("(?<=[.!?])\s+");
        for (int i = 0; i < sentences.length;i++){
            System.out.println("Исходная строка: " + sentences[i]);
            for (String word : wordsToRemove) {
                sentences[i] = sentences[i].replaceAll(word, "");
            }
            sentences[i] = sentences[i].replaceAll("(\b[а-яА-Яa-zA-z]+\b)(?=\\s+\\1)", "$1"); // i mean it works but for eng idk just can't ad for rus i tried
            sentences[i] = sentences[i].replaceAll("(шо|чео|Чео|Шо|чо|Чо)", "что");
            System.out.println("Измененная строка: " + sentences[i]);
        }
    }
}
