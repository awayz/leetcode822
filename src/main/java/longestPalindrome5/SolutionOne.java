package longestPalindrome5;

public class SolutionOne implements Solution {
    
    /*
    最长回文子串
    
    暴力计算，挨个判断以s[i]为对称中心的（奇数个）和以s[i]为左对称点的(偶数个)
    2. 也可以列出a[0...i]的每个字符串然后用 dp 判断是不是回文, 也是 n^2
     */
    @Override
    public String longestPalindrome (String s) {
        if (s.length() == 1) {
            return s;
        }
        int max = 0;
        // 左右闭区间
        int maxStart = 0;
        int maxEnd = 0;
        int l;
        int r;
        for (int i = 0; i < s.length() - 1; i++) {
            // 以 i 为 中心
            l = i - 1;
            r = i + 1;
            while (l >= 0 && r <= s.length() - 1 && s.charAt(l) == s.charAt(r)) {
                l--;r++;
            }
            l++;r--;
            if (r - l + 1 > max) {
                max = r - l + 1;
                maxStart = l;
                maxEnd = r;
            }
            
            // i为左对称点
            l = i;
            r = i + 1;
            while (l >= 0 && r <= s.length() - 1 && s.charAt(l) == s.charAt(r)) {
                l--;r++;
            }
            l++;r--;
            if (r - l + 1 > max) {
                max = r - l + 1;
                maxStart = l;
                maxEnd = r;
            }
        }
        return s.substring(maxStart, maxEnd + 1);
    }
}
