package threeSum15;

import java.util.*;

/**
 * @author zhumingwei
 * @date 8/8/2022 - 1:57 PM
 */
public class SolutionTwo implements Solution {
    
    @Override
    public List<List<Integer>> threeSum (int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        Map<Integer, Integer> idxMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            idxMap.put(nums[i], i);
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            Integer third = idxMap.get(- nums[left] - nums[right]);
            if (third != null && third > left && third < right) {
                result.add(List.of(nums[left], - nums[left] - nums[right], nums[right]));
                left++;
                right--;
            } else {
                left++;
            }
        }
        return new ArrayList<>(result);
    }
}