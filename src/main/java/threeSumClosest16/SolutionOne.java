package threeSumClosest16;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SolutionOne implements Solution {
    
    @Override
    public int threeSumClosest (int[] nums, int target) {
        if (nums.length < 3) {
            return IntStream.of(nums).sum();
        }
        Arrays.sort(nums);
        int bias = Integer.MAX_VALUE;
        int result = target;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int t = nums[left] + nums[right] + nums[i];
                int l = Math.abs(t - target);
                if (l < bias) {
                    bias = l;
                    result = t;
                }
                if (t > target) {
                    right--;
                } else if (t < target) {
                    left++;
                } else {
                    return target;
                }
            }
        }
        return result;
    }
}