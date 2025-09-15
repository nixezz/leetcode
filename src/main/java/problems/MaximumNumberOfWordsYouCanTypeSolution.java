package problems;

public class MaximumNumberOfWordsYouCanTypeSolution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int counter = words.length;

        for (String word : words) {
            for(int i = 0; i < word.length(); i++) {
                if(brokenLetters.indexOf(word.charAt(i)) != -1){
                    counter--;
                    break;
                }
            }
        }

        return counter;
    }
}
