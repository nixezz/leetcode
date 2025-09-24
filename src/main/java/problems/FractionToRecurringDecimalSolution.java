package problems;

import java.util.HashMap;
import java.util.Map;

public class FractionToRecurringDecimalSolution {
    public String fractionToDecimal(int numerator, int denominator) {
        boolean isNegative = (numerator < 0 && denominator > 0 || numerator > 0 && denominator < 0);
        long numeratorLong = Math.abs((long) numerator);
        long denominatorLong = Math.abs((long) denominator);
        Map<Long, Integer> previousRemains = new HashMap<Long, Integer>();
        StringBuilder sb = new StringBuilder();
        long quotian = numeratorLong / denominatorLong;
        sb.append(quotian);

        numeratorLong %= denominatorLong;

        if (numeratorLong != 0) {
            sb.append(".");
        }

        int quotianIndex = 0;
        while (numeratorLong != 0) {
            numeratorLong *= 10;
            quotian = Math.abs(numeratorLong / denominatorLong);
            if (!previousRemains.containsKey(numeratorLong)) {
                sb.append(quotian);
                previousRemains.put(numeratorLong, quotianIndex++);
            } else {
                int firstIndex = 1 + previousRemains.get(numeratorLong) + sb.indexOf(".");
                sb.insert(firstIndex, "(");
                sb.append(")");
                break;
            }
            numeratorLong %= denominatorLong;
        }

        if (isNegative){
            sb.insert(0, "-");
        }
        return sb.toString();
    }
}
