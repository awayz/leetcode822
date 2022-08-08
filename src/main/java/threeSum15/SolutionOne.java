package threeSum15;

import java.util.*;

public class SolutionOne implements Solution {
    
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
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                Integer third = idxMap.get(- nums[i] - nums[j]);
                if (third != null && third > j) {
                    result.add(List.of(nums[i], nums[j], - nums[i] - nums[j]));
                }
            }
        }
        return new ArrayList<>(result);
    }
}