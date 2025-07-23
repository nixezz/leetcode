package problems;

public class LongestCommonPrefixSolution {
//    public String longestCommonPrefix(String[] strs) {
//        if(strs.length == 0) return "";
//        String prefix = strs[0];
//        for (int i = 0; i < strs.length; i++) {
//            while (strs[i].indexOf(prefix) != 0) {
//                prefix = prefix.substring(0, prefix.length() - 1);
//                if (prefix.isEmpty()) return "";
//            }
//        }
//        return prefix;
//    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) { return ""; }
        return longestCommonPrefix(strs, 0, strs.length - 1);
    }

    private String longestCommonPrefix(String[] strs, int l, int r){
        if(l == r) { return strs[l]; }
        int mid = (l + r) / 2;
        String left = longestCommonPrefix(strs, l, mid);
        String right = longestCommonPrefix(strs, mid + 1, r);
        return commonPrefix(left, right);
    }

    private String commonPrefix(String left, String right){
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                return left.substring(0, i);
            }
        }
        return left.substring(0, min);
    }
}
