package isPalindrome9;

/**
 * @author zhumingwei
 * @date 8/4/2022 - 12:33 PM
 */
public class SolutionTwo implements Solution {
    /**
     * 1. 不使用额外的数组存储数字，直接计算另一半倒转之后的值，如果 相等（偶数）或者 left == reverse / 10 (奇数)，说明是回文
     * 2. 如果 reverse >= left，说明已经处理了一半了
     */
    @Override
    public boolean isPalindrome (int x) {
        if (x < 0 || ((x % 10) == 0 && x != 0)) {
            return false;
        }
        int reverse = 0;
        while (reverse < x) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        return reverse == x || x == reverse / 10;
    }
}