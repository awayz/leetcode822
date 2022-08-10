package threeSum15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhumingwei
 * @date 8/8/2022 - 1:57 PM
 */
public class SolutionTwo implements Solution {
    
    @Override
    public List<List<Integer>> threeSum (int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int t = nums[left] + nums[right];
                if (t > - nums[i]) {
                    right--;
                } else if (t < - nums[i]) {
                    left++;
                } else {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left + 1] == nums[left]) {
                        left++;
                    }
                    while (left < right && nums[right - 1] == nums[right]) {
                        right--;
                    }
                    left++;
                    right--;
                }
            }
        }
        return result;
    }
}