package maxArea11;

public class SolutionOne implements Solution {
    
    /**
     * 死方法直接算
     * 如果 h[i] <= 前面最小的 h，就跳过
     * 如果 h[j] <= 后面最大的 h，就跳过
     * <p>
     * 超时了！！！
     */
    @Override
    public int maxArea (int[] height) {
        int maxArea = 0;
        int[] minL = new int[height.length];
        int[] maxR = new int[height.length];
        int[] idxR = new int[height.length];
        
        minL[0] = height[0];
        maxR[height.length - 1] = height[height.length - 1];
        idxR[height.length - 1] = height.length - 1;
        for (int i = 1; i < height.length; i++) {
            minL[i] = Math.min(height[i], minL[i - 1]);
        }
        
        
        for (int j = height.length - 2; j >= 0; j--) {
            if (height[j] > maxR[j + 1]) {
                maxR[j] = height[j];
                idxR[j] = j;
            } else {
                maxR[j] = maxR[j + 1];
                idxR[j] = idxR[j + 1];
            }
            
            
        }
        for (int i = 0; i < height.length - 1; i++) {
            while (i > 0 && i < height.length - 1 && height[i] <= minL[i - 1]) {
                i++;
            }
            for (int j = idxR[i]; j < height.length; j++) {
                int area = Math.min(height[i], height[j]) * (j - i);
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }
} 