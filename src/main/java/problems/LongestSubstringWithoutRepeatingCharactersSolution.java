package problems;

public class LongestSubstringWithoutRepeatingCharactersSolution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        int max_length = 0;
        for(int i = 0; i < s.length(); i++) {
            int index = sb.indexOf(String.valueOf(s.charAt(i)));
            if(index != -1) {
                max_length = Math.max(max_length, sb.length());
                sb.delete(0, index+1);
            }
            sb.append(s.charAt(i));
        }
        return Math.max(max_length, sb.length());
    }
}
