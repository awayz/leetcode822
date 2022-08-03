package myAtoi8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author zhumingwei
 * @date 8/3/2022 - 7:27 PM
 */
class SolutionTest {
    
    private Solution solution;
    
    @BeforeEach
    void init () throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Class<?> solutionClass = Class.forName("myAtoi8.SolutionOne");
        solution = (Solution) solutionClass.getDeclaredConstructor().newInstance();
    }
    
    @Test
    void test1 () {
        int actual = solution.myAtoi("42");
        assertEquals(42, actual);
    }
    
    @Test
    void test2 () {
        int actual = solution.myAtoi("-42");
        assertEquals(-42, actual);
    }
    
    @Test
    void test3 () {
        int actual = solution.myAtoi("- 42");
        assertEquals(0, actual);
    }
    
    @Test
    void test4 () {
        int actual = solution.myAtoi("    42");
        assertEquals(42, actual);
    }
    
    @Test
    void test5 () {
        int actual = solution.myAtoi("    42  with words   ");
        assertEquals(42, actual);
    }
    
    
    @Test
    void test6 () {
        int actual = solution.myAtoi("    2147483647  ");
        assertEquals(2147483647, actual);
    }
    
    @Test
    void test7 () {
        int actual = solution.myAtoi("    -2147483648  ");
        assertEquals(-2147483648, actual);
    }
    
    @Test
    void test8 () {
        int actual = solution.myAtoi("    2147483648  ");
        assertEquals(2147483647, actual);
    }
    
    @Test
    void test9 () {
        int actual = solution.myAtoi("    -2147483649  ");
        assertEquals(-2147483648, actual);
    }
    
    @Test
    void test10 () {
        int actual = solution.myAtoi("    +2147483647  ");
        assertEquals(2147483647, actual);
    }
    
}