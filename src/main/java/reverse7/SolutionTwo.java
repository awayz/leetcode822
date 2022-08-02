package reverse7;


public class SolutionTwo implements Solution {
    
    /*
    改进：
    1. reverse 数组没必要列出来，拿到末尾的数之后直接计算就行了
    2. 负数也不需要另外考虑
    3. 因为是 r = r * 10 + n, 所以前导 0 不用额外去掉，直接计算
    4. 因为有负数，所以 while 终止条件不是 x > 0, 应该是 x != 0
     */
    @Override
    public int reverse (int x) {
        int r = 0;
        while (x != 0) {
            if( r > Integer.MAX_VALUE / 10 || r < Integer.MIN_VALUE / 10) {
                return 0;
            }
            r = r * 10 + x % 10;
            x = x / 10;
        }
        return r;
    }
}
