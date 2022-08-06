package maxArea11;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhumingwei
 * @date 8/6/2022 - 11:09 AM
 */
class SolutionTest {
    
    private Solution solution;
    
    @BeforeEach
    void init () throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Class<?> solutionClass = Class.forName("maxArea11.SolutionTwo");
        solution = (Solution) solutionClass.getDeclaredConstructor().newInstance();
    }
    
    @Test
    void test1 () {
        int actual = solution.maxArea(new int[]{1, 2});
        assertEquals(1, actual);
    }
    
    @Test
    void test2 () {
        int actual = solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        assertEquals(49, actual);
    }
    
    @Test
    void test3 () {
        int actual = solution.maxArea(new int[]{2, 2, 3, 4, 5, 5, 4, 5, 3, 2, 2, 2, 2, 2, 2, 2, 2});
        assertEquals(32, actual);
    }
    
    @Test
    void test4 () {
        int actual = solution.maxArea(new int[]{2, 3, 4, 5, 18, 17, 6});
        assertEquals(17, actual);
    }
}