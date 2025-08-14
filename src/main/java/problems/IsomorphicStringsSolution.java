package problems;

import java.util.HashMap;

public class IsomorphicStringsSolution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character charS = s.charAt(i);
            Character charT = t.charAt(i);

            if (map.containsKey(charS)) {
                if (map.get(charS) != charT) {
                    return false;
                }
            } else if(map.containsValue(charT)) {
                return false;
            }
            map.put(charS, charT);
        }
        return true;
    }
}
