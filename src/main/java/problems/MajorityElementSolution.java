package problems;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MajorityElementSolution {
    public int majorityElement(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(
                        num -> num,
                        Collectors.counting()
                ))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > nums.length / 2)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow();
    }
}
