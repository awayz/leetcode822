package isPalindrome9;

public class SolutionOne implements Solution {
    
    @Override
    public boolean isPalindrome (int x) {
        if (x < 0) {
            return false;
        }
        int[] nums = new int[10];
        int r = 0;
        int l = 0;
        while (x != 0) {
            nums[r] = x % 10;
            x = x / 10;
            r++;
        }
        r--;
        while (l < r) {
            if (nums[r] != nums[l]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}