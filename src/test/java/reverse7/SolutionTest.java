package reverse7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;
    
    @BeforeEach
    void init () throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Class<?> solutionClass = Class.forName("reverse7.SolutionTwo");
        solution = (Solution) solutionClass.getDeclaredConstructor().newInstance();
    }
    
    @Test
    void test1 () {
        int actual = solution.reverse(1);
        assertEquals(1, actual);
    }
    
    @Test
    void test2 () {
        int actual = solution.reverse(123);
        assertEquals(321, actual);
    }
    
    @Test
    void test3 () {
        int actual = solution.reverse(1234);
        assertEquals(4321, actual);
    }
    
    @Test
    void test4 () {
        int actual = solution.reverse(1200);
        assertEquals(21, actual);
    }
    
    @Test
    void test5 () {
        int actual = solution.reverse(-987);
        assertEquals(-789, actual);
    }
    
    @Test
    void test6 () {
        int actual = solution.reverse(-1200);
        assertEquals(-21, actual);
    }
    
    @Test
    void test7 () {
        int actual = solution.reverse(-2000000099);
        assertEquals(0, actual);
    }
    
    @Test
    void test8 () {
        int actual = solution.reverse(2000000099);
        assertEquals(0, actual);
    }
    
    @Test
    void test9 () {
        int actual = solution.reverse( -2147483648);
        assertEquals(0, actual);
    }
    
    @Test
    void test10 () {
        int actual = solution.reverse(2147483647);
        assertEquals(0, actual);
    }
    
   
}