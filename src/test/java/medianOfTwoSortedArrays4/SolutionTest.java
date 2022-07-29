package medianOfTwoSortedArrays4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    
    private Solution solution;
    
    @BeforeEach
    void init () throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> solutionClass = Class.forName("medianOfTwoSortedArrays4.SolutionOne");
        solution = (Solution) solutionClass.getDeclaredConstructor().newInstance();
    }
    
    @Test
    void test1 () {
        int[] nums1 = new int[]{10};
        int[] nums2 = new int[]{};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(10, result);
    }
    
    @Test
    void test2 () {
        int[] nums1 = new int[]{10, 20};
        int[] nums2 = new int[]{};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(15, result);
    }
    
    @Test
    void test3 () {
        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{4, 5};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(3, result);
    }
    
    @Test
    void test4 () {
        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{4, 5, 6};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(3.5, result);
    }
    
    @Test
    void test5 () {
        int[] nums1 = new int[]{1, 2, 3, 4};
        int[] nums2 = new int[]{4, 5, 6, 7, 8};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(4, result);
    }
    
    
    @Test
    void test6 () {
        int[] nums1 = new int[]{1, 2, 10, 11};
        int[] nums2 = new int[]{4, 5};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(4.5, result);
    }
    
    @Test
    void test7 () {
        int[] nums1 = new int[]{1, 2, 10, 11};
        int[] nums2 = new int[]{4, 5, 6};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(5, result);
    }
    
    @Test
    void test8 () {
        int[] nums1 = new int[]{1, 9, 10, 11};
        int[] nums2 = new int[]{4, 5};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(7, result);
    }
    
    @Test
    void test9 () {
        int[] nums1 = new int[]{1, 9, 10, 11};
        int[] nums2 = new int[]{4, 5, 10};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(9, result);
    }
}