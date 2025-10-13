package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindResultantArrayAfterRemovingAnagramsSolution {
    public List<String> removeAnagrams(String[] words) {
        String previous = "";
        List<String> list =new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            char[] ch = words[i].toCharArray();
            Arrays.sort(ch);
            String curr = String.valueOf(ch);
            if(!curr.equals(previous)){
                list.add(words[i]);
                previous = curr;
            }
        }
        return list;
    }
}
