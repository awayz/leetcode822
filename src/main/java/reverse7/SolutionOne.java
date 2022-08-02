package reverse7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SolutionOne implements Solution {
    
    /*
    注意点：
    1. 考虑 -2147483648, 相反数里没有对应的正数
    2. 考虑怎么判断溢出
     */
    @Override
    public int reverse (int x) {
        if (x == 0 || x == Integer.MIN_VALUE) {
            return 0;
        }
        
        boolean isNegative = false;
        if (x < 0) {
            x = - x;
            isNegative = true;
        }
        List<Integer> reversedList = toReverseArrays(x);
        trimLeadingZero(reversedList);
        return compute(reversedList, isNegative);
    }
    
    private List<Integer> toReverseArrays (int x) {
        List<Integer> result = new ArrayList<>();
        while (x > 0) {
            result.add(x % 10);
            x = x / 10;
        }
        return result;
    }
    
    private void trimLeadingZero (List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next == 0) {
                iterator.remove();
            } else {
                return;
            }
        }
    }
    
    private int compute (List<Integer> list, boolean isNegative) {
        int result = 0;
        int i;
        for (i = 0; i < list.size() - 1; i++) {
            result = result * 10 + list.get(i);
        }
        if (result > (Integer.MAX_VALUE - list.get(i)) / 10.0) {
            return 0;
        } else {
            result = result * 10 + list.get(i);
        }
        if (isNegative) {
            return - result;
        }
        return result;
    }
}
