package problems;

import org.junit.jupiter.api.Test;
import util.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MergeTwoSortedListsSolutionTest {
    MergeTwoSortedListsSolution solution = new MergeTwoSortedListsSolution();

    private ListNode createList(int[] vals) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int v : vals) {
            curr.next = new ListNode(v);
            curr = curr.next;
        }
        return dummy.next;
    }

    private void assertListEquals(ListNode head, int[] expected) {
        int i = 0;
        while (head != null && i < expected.length) {
            assertEquals(expected[i], head.val);
            head = head.next;
            i++;
        }
        assertNull(head);
        assertEquals(expected.length, i);
    }

    @Test
    public void mergeTwoListsTest_1() {
        ListNode list1 = createList(new int[]{1, 2, 4});
        ListNode list2 = createList(new int[]{1, 3, 4});
        ListNode merged = solution.mergeTwoLists(list1, list2);
        assertListEquals(merged, new int[]{1, 1, 2, 3, 4, 4});
    }

    @Test
    public void mergeTwoListsTest_2() {
        ListNode list1 = createList(new int[]{});
        ListNode list2 = createList(new int[]{});
        ListNode merged = solution.mergeTwoLists(list1, list2);
        assertListEquals(merged, new int[]{});
    }

    @Test
    public void mergeTwoListsTest_3() {
        ListNode list1 = createList(new int[]{});
        ListNode list2 = createList(new int[]{0});
        ListNode merged = solution.mergeTwoLists(list1, list2);
        assertListEquals(merged, new int[]{0});
    }
}
