package threeSum15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhumingwei
 * @date 8/8/2022 - 1:41 PM
 */
class SolutionTest {
    
    private Solution solution;
    
    @BeforeEach
    void init () throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Class<?> solutionClass = Class.forName("threeSum15.SolutionOne");
        solution = (Solution) solutionClass.getDeclaredConstructor().newInstance();
    }
    
    @Test
    void test1 () {
        List<List<Integer>> actual = solution.threeSum(new int[]{- 1, 0, 1, 2, - 1, - 4});
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(- 1, - 1, 2));
        expected.add(List.of(- 1, 0, 1));
        assertEquals(expected, actual);
    }
    
    @Test
    void test2 () {
        List<List<Integer>> actual = solution.threeSum(new int[]{});
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }
    
    @Test
    void test3 () {
        List<List<Integer>> actual = solution.threeSum(new int[]{0});
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }
    
    @Test
    void test4 () {
        List<List<Integer>> actual = solution.threeSum(new int[]{0, 0, 0});
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(0, 0, 0));
        assertEquals(expected, actual);
    }
}