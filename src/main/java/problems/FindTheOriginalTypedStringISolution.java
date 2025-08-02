package problems;

public class FindTheOriginalTypedStringISolution {
    public int possibleStringCount(String word) {
        if (word.length() == 1) return 1;

        int result = 1;
        char previous_character = word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            if (previous_character == word.charAt(i)) {
                result++;
            }
            previous_character = word.charAt(i);
        }

        return result;
        
    }
}
