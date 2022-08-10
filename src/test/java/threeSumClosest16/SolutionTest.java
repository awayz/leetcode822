package threeSumClosest16;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhumingwei
 * @date 8/10/2022 - 7:24 PM
 */
class SolutionTest {
    
    private Solution solution;
    
    @BeforeEach
    void init () throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Class<?> solutionClass = Class.forName("threeSumClosest16.SolutionOne");
        solution = (Solution) solutionClass.getDeclaredConstructor().newInstance();
    }
    
    @Test
    void test1 () {
        int actual = solution.threeSumClosest(new int[]{- 1, 2, 1, - 4}, 1);
        assertEquals(2, actual);
    }
    
    @Test
    void test2 () {
        int actual = solution.threeSumClosest(new int[]{0, 0, 0}, 1);
        assertEquals(0, actual);
    }
    
    @Test
    void test3 () {
        int actual = solution.threeSumClosest(new int[]{1, 1, 1, 0}, - 100);
        assertEquals(2, actual);
    }
}