package medianOfTwoSortedArrays4;

/**
 * @author zhumingwei
 * @date 28/07/2022 - 21:57
 */
public class SolutionOne implements Solution {
    
    /**
     * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
     */
    public double findMedianSortedArrays (int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedian(nums1, nums2);
        } else {
            return findMedian(nums2, nums1);
        }
    }
    
    /**
     * 这里考虑的是两个数组的中间两个数（1个），以此为基准减去左边或者右边一半
     * 其实只考虑一边的写起来更简单，也就是只减去左边的，然后找第k大的数（k越来越小）
     */
    private double findMedian(int[] nums1, int[] nums2) {
        int s1 = nums1.length;
        int s2 = nums2.length;
        
        int startIdx1 = 0;
        int endIdx1 = s1 - 1;
        int startIdx2 = 0;
        int endIdx2 = s2 - 1;
    
        while (true) {
            int l1 = (startIdx1 + endIdx1) / 2;
            int r1 = (startIdx1 + endIdx1 + 1) / 2;
        
            int l2 = (startIdx2 + endIdx2) / 2;
            int r2 = (startIdx2 + endIdx2 + 1) / 2;
            
            if (s1 == 0) {
                return (nums2[l2] + nums2[r2]) / 2.0;
            }
            if (s2 == 0) {
                return (nums1[l1] + nums1[r1]) / 2.0;
            }
            
            if (startIdx1 == endIdx1) {
                return (nums1[startIdx1] + nums2[startIdx2]) / 2.0;
            }
            
            if (startIdx2 == endIdx2) {
                int tmp = nums2[startIdx2];
                 if (((endIdx1-startIdx1 + 1) & 1) == 0) { // even
                    if(tmp <= nums1[l1]) {
                        return nums1[l1];
                    }
                    return Math.min(tmp, nums1[r1]);
                }
                else {
                    if (tmp <= nums1[l1-1]) {
                        return (nums1[l1-1] + nums1[l1]) / 2.0;
                    } else if (tmp >= nums1[l1+1]) {
                        return (nums1[l1] + nums1[l1+1]) / 2.0;
                    } else {
                        return (tmp + nums1[l1]) / 2.0;
                    }
                }
            }
            
            // nums1 的左右部分都不可能是中位数
            if (nums1[l1] <= nums2[l2] && nums1[r1] >= nums2[r2]) {
                return (nums2[l2] + nums2[r2]) / 2.0;
            }
    
            // nums2 的左右部分都不可能是中位数
            if (nums2[l2] <= nums1[l1] && nums2[r2] >= nums1[r1]) {
                return (nums1[l1] + nums1[r1]) / 2.0;
            }
    
            int bias = (endIdx2-startIdx2+1) / 2; // 用短的那边的长度作为基准去减
            if (nums1[l1] <= nums2[l2]) {
                endIdx2 -=bias;
                startIdx1 += bias;
            } else if (nums2[l2] <= nums1[l1]) {
                startIdx2 += bias;
                endIdx1 -= bias;
            }
           
        }
    }
}
