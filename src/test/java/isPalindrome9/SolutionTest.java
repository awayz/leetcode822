package isPalindrome9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author zhumingwei
 * @date 8/4/2022 - 12:26 PM
 */
class SolutionTest {
    
    private Solution solution;
    
    @BeforeEach
    void init () throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Class<?> solutionClass = Class.forName("isPalindrome9.SolutionTwo");
        solution = (Solution) solutionClass.getDeclaredConstructor().newInstance();
    }
    
    @Test
    void test1 () {
        boolean actual = solution.isPalindrome(2147483647);
        assertFalse(actual);
    }
    
    @Test
    void test2 () {
        boolean actual = solution.isPalindrome(- 2147483648);
        assertFalse(actual);
    }
    
    @Test
    void test3 () {
        boolean actual = solution.isPalindrome(0);
        assertTrue(actual);
    }
    
    @Test
    void test4 () {
        boolean actual = solution.isPalindrome(22);
        assertTrue(actual);
    }
    
    @Test
    void test5 () {
        boolean actual = solution.isPalindrome(789);
        assertFalse(actual);
    }
    
    @Test
    void test6 () {
        boolean actual = solution.isPalindrome(112221);
        assertFalse(actual);
    }
}