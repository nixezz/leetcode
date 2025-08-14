package problems;

public class LargestThreeSameDigitNumberInStringSolution {
    public String largestGoodInteger(String num) {
        int max = -1;
        for(int i = 0; i < num.length() - 2; i++){
            if((num.charAt(i) == num.charAt(i+1)) && (num.charAt(i) == num.charAt(i+2))){
                int x = Integer.parseInt(num.substring(i, i+3));
                if(max < x) max = x;
            }
        }
        if(max == -1) return "";
        StringBuilder sMax = new StringBuilder().append(max);
        if(sMax.length() != 3){
            while(sMax.length() != 3){
                sMax.append("0");
            }
            sMax.reverse();
        }
        return String.valueOf(sMax);
    }
}
