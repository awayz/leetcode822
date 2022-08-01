package longestPalindrome5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("ALL")
class SolutionTest {
    
    private Solution solution;
    
    @BeforeEach
    void init () throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Class<?> solutionClass = Class.forName("longestPalindrome5.SolutionOne");
        solution = (Solution) solutionClass.getDeclaredConstructor().newInstance();
    }
    
    @Test
    void test1 () {
        String actual = solution.longestPalindrome("a");
        assertEquals("a", actual);
    }
    
    @Test
    void test2 () {
        String actual = solution.longestPalindrome("aa");
        assertEquals("aa", actual);
    }
    
    @Test
    void test3 () {
        String actual = solution.longestPalindrome("aba");
        assertEquals("aba", actual);
    }
    
    @Test
    void test4 () {
        String actual = solution.longestPalindrome("abababab");
        assertTrue(List.of("abababa", "bababab").contains(actual));
    }
    
    @Test
    void test5 () {
        String actual = solution.longestPalindrome("aaaaaaaaaaaa");
        assertEquals("aaaaaaaaaaaa", actual);
    }
    
    @Test
    void test6 () {
        String actual = solution.longestPalindrome("aacdfghq");
        assertEquals("aa", actual);
    }
    
    @Test
    void test7 () {
        String actual = solution.longestPalindrome("abacdegedcabacdegedcaba");
        assertEquals("abacdegedcabacdegedcaba", actual);
    }
    
    @Test
    void test8 () {
        String actual = solution.longestPalindrome("aba");
        assertEquals("aba", actual);
    }
}