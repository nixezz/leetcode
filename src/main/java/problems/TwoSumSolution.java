package problems;

public class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left < right){
            int current_sum = nums[left] + nums[right];
            if(current_sum == target){
                return new int[]{left, right};
            } else if(current_sum < right){
                right -= 1;
            } else {
                left += 1;
            }
        }
        return null;
    }
}
