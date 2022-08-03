package myAtoi8;

public class SolutionOne implements Solution {
    
    /**
     * 比较简单的状态机？
     * @param s
     * @return
     */
    @Override
    public int myAtoi (String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        boolean isNegative = false;
        
        // trim space
        int i = 0;
        while (i < chars.length && chars[i] == ' ') {
            i++;
        }
        // reach end
        if (i == chars.length) {
            return 0;
        }
        
        // sign as end
        if (chars[i] == '-') {
            isNegative = true;
        } else if (chars[i] >= '0' && chars[i] <= '9') {
            result = chars[i] - '0';
        } else if (chars[i] != '+'){
            return 0;
        }
        
        i++;
        
        while (i < chars.length && chars[i] <= '9' && chars[i] >= '0') {
            int n = chars[i] - '0';
            if (isNegative) {
                if (result < (Integer.MIN_VALUE + n) / 10.0) {
                    return Integer.MIN_VALUE;
                }
                result = result * 10 - n;
            } else {
                if (result > (Integer.MAX_VALUE - n) / 10.0) {
                    return Integer.MAX_VALUE;
                }
                result = result * 10 + n;
            }
            
            i++;
        }
        return result;
    }
}