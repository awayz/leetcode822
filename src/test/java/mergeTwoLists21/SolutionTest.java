package mergeTwoLists21;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhumingwei
 * @date 8/16/2022 - 12:48 PM
 */
class SolutionTest {
    
    
    private Solution solution;
    
    @BeforeEach
    void init () throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Class<?> solutionClass = Class.forName("mergeTwoLists21.SolutionOne");
        solution = (Solution) solutionClass.getDeclaredConstructor().newInstance();
    }
    
    @Test
    void test1 () {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(1);
        ListNode result = solution.mergeTwoLists(list1, list2);
        List<Integer> resultList = new ArrayList<>();
        while (result != null) {
            resultList.add(result.val);
            result = result.next;
        }
        List<Integer> expected = List.of(1, 1);
        assertEquals(expected, resultList);
    }
    
    @Test
    void test2 () {
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();
        ListNode result = solution.mergeTwoLists(list1, list2);
        List<Integer> resultList = new ArrayList<>();
        while (result != null) {
            resultList.add(result.val);
            result = result.next;
        }
        List<Integer> expected = List.of(0, 0);
        assertEquals(expected, resultList);
    }
    
    @Test
    void test3 () {
        ListNode l1_3 = new ListNode(4);
        ListNode l1_2 = new ListNode(2, l1_3);
        ListNode list1 = new ListNode(1, l1_2);
        
        ListNode l2_3 = new ListNode(4);
        ListNode l2_2 = new ListNode(3, l2_3);
        ListNode list2 = new ListNode(1, l2_2);
        ListNode result = solution.mergeTwoLists(list1, list2);
        List<Integer> resultList = new ArrayList<>();
        while (result != null) {
            resultList.add(result.val);
            result = result.next;
        }
        List<Integer> expected = List.of(1, 1, 2, 3, 4, 4);
        assertEquals(expected, resultList);
    }
    
    @Test
    void test4 () {
        ListNode list1 = null;
        ListNode list2 = null;
        ListNode result = solution.mergeTwoLists(list1, list2);
        List<Integer> resultList = new ArrayList<>();
        while (result != null) {
            resultList.add(result.val);
            result = result.next;
        }
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, resultList);
    }
}