package problems;

public class LicenseKeyFormattingSolution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            if(s.charAt(i) != '-') {
                sb.append(s.charAt(i));
                count++;
                if (count == k) {
                    sb.append('-');
                    count = 0;
                }
            }
        }
        if(!sb.isEmpty()) {
            if (sb.charAt(sb.length() - 1) == '-') {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.reverse().toString().toUpperCase();
        }
        return "";
    }
}
