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
        Map<Integer, List<Integer>> idxMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> idxList = idxMap.getOrDefault(nums[i], new ArrayList<>());
            idxList.add(i);
            idxMap.put(nums[i], idxList);
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            List<Integer> idxList = idxMap.get(- nums[left] - nums[right]);
            if (idxList != null && containsBetween(left, right, idxList)) {
                result.add(List.of(nums[left], - nums[left] - nums[right], nums[right]));
                right--;
            } else {
                left++;
            }
            while (left > 1 && left < right && (nums[left - 1] == nums[left])) {
                left++;
            }
            while (right < nums.length - 1 && right > left && nums[right] == nums[right + 1]) {
                right--;
            }
        }
        return new ArrayList<>(result);
    }
    
    private boolean containsBetween (int left, int right, List<Integer> idxList) {
        for (Integer integer : idxList) {
            if (integer > left && integer < right) {
                return true;
            }
        }
        return false;
    }
}