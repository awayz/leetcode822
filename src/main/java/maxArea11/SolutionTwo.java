package maxArea11;

/**
 * 双指针法
 * 指向左右两个边界，哪边小移动哪边
 * <p>
 * 因为小的那边，失去了作为边界的可能性。假设 左边是小的那边，右边的指针只要往左移，面积一定会减小。 所以可以认为这个左边界可以不考虑了。
 * 问题就转化为了求 [i+1,j] 的最大面积
 *
 * @author zhumingwei
 * @date 8/6/2022 - 2:17 PM
 */
public class SolutionTwo implements Solution {
    @Override
    public int maxArea (int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;
        while (i < j) {
            maxArea = Math.max((Math.min(height[i], height[j])) * (j - i), maxArea);
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return maxArea;
    }
}