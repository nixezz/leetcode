package problems;

public class BaseSevenSolution{
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        boolean isNegativeNumber = num < 0;
        StringBuilder result = new StringBuilder();
        while (num != 0) {
            int remainder = num % 7 > 0 ? num % 7 : num % 7 * -1;
            num /= 7;
            result.insert(0, remainder);
        }
        if(isNegativeNumber) result.insert(0, "-");
        return result.toString();
    }
}

