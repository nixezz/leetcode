package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class SortVowelsInAStringSolution {
    public String sortVowels(String s) {
        Set<Character> vowelsSet = Set.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        List<Character> vowels = new ArrayList<>();

        for(char c : s.toCharArray()) {
            if(vowelsSet.contains(c)) {
                vowels.add(c);
            }
        }

        Collections.sort(vowels);

        StringBuilder sb = new StringBuilder();
        int index = 0;

        for(char c : s.toCharArray()) {
            if(vowelsSet.contains(c)) {
                sb.append(vowels.get(index++));
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
