package problems;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class LexicographicallySmallestStringAfterApplyingOperationsSolution {
    public String findLexSmallestString(String s, int a, int b) {
        int n = s.length();
        String smallest = s;
        Queue<String> queue = new LinkedList<>();
        queue.offer(s);
        Set<String> seen = new HashSet<>(queue);
        while (!queue.isEmpty()) {
            String current = queue.poll();
            if (smallest.compareTo(current) > 0)
                smallest = current;
            char[] charArray = current.toCharArray();
            for (int i = 1; i < charArray.length; i += 2)
                charArray[i] = (char)((charArray[i] - '0' + a) % 10 + '0');
            String addA = String.valueOf(charArray);
            if (seen.add(addA))
                queue.offer(addA);
            String rotate = current.substring(n - b) + current.substring(0, n - b);
            if (seen.add(rotate))
                queue.offer(rotate);
        }
        return smallest;
    }
}
