package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MergeKSortedListsTest {

    private final MergeKSortedLists solution = new MergeKSortedLists();

    // Helper method to create a linked list from an array
    private ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to convert a linked list to an array
    private int[] linkedListToArray(ListNode head) {
        ListNode current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        int[] result = new int[size];
        current = head;
        for (int i = 0; i < size; i++) {
            result[i] = current.val;
            current = current.next;
        }
        return result;
    }

    // Test 1: Merging multiple sorted lists into one
    @Test
    public void testMergeKSortedLists() {
        ListNode[] lists = new ListNode[]{
                createLinkedList(new int[]{1, 4, 5}),
                createLinkedList(new int[]{1, 3, 4}),
                createLinkedList(new int[]{2, 6})
        };
        ListNode result = solution.mergeKLists(lists);
        int[] expected = new int[]{1, 1, 2, 3, 4, 4, 5, 6};
        assertArrayEquals(expected, linkedListToArray(result));
    }

    // Test 2: Empty input list
    @Test
    public void testEmptyInputList() {
        ListNode[] lists = new ListNode[]{};
        ListNode result = solution.mergeKLists(lists);
        assertNull(result);
    }

    // Test 3: Array with one empty linked list
    @Test
    public void testSingleEmptyList() {
        ListNode[] lists = new ListNode[]{createLinkedList(new int[]{})};
        ListNode result = solution.mergeKLists(lists);
        assertNull(result);
    }

    // Test 4: Array with one non-empty linked list
    @Test
    public void testSingleNonEmptyList() {
        ListNode[] lists = new ListNode[]{createLinkedList(new int[]{1, 4, 5})};
        ListNode result = solution.mergeKLists(lists);
        int[] expected = new int[]{1, 4, 5};
        assertArrayEquals(expected, linkedListToArray(result));
    }

    // Test 5: All lists are already sorted, but interleave at different points
    @Test
    public void testInterleavedSortedLists() {
        ListNode[] lists = new ListNode[]{
                createLinkedList(new int[]{1, 5, 9}),
                createLinkedList(new int[]{2, 6, 10}),
                createLinkedList(new int[]{3, 7, 11}),
                createLinkedList(new int[]{4, 8, 12})
        };
        ListNode result = solution.mergeKLists(lists);
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        assertArrayEquals(expected, linkedListToArray(result));
    }

    // Test 6: Lists containing only negative values
    @Test
    public void testNegativeValues() {
        ListNode[] lists = new ListNode[]{
                createLinkedList(new int[]{-9, -7, -5}),
                createLinkedList(new int[]{-8, -6, -4}),
                createLinkedList(new int[]{-3, -2, -1})
        };
        ListNode result = solution.mergeKLists(lists);
        int[] expected = new int[]{-9, -8, -7, -6, -5, -4, -3, -2, -1};
        assertArrayEquals(expected, linkedListToArray(result));
    }

    // Test 7: Lists of varying sizes
    @Test
    public void testVaryingSizes() {
        ListNode[] lists = new ListNode[]{
                createLinkedList(new int[]{1, 4, 5}),
                createLinkedList(new int[]{1, 3}),
                createLinkedList(new int[]{2, 6}),
                createLinkedList(new int[]{-1})
        };
        ListNode result = solution.mergeKLists(lists);
        int[] expected = new int[]{-1, 1, 1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, linkedListToArray(result));
    }

    // Test 8: Large input with many lists
//    @Test
//    public void testLargeInput() {
//        ListNode[] lists = new ListNode[10000];
//        for (int i = 0; i < 10000; i++) {
//            lists[i] = createLinkedList(new int[]{i, i + 1, i + 2});
//        }
//        ListNode result = solution.mergeKLists(lists);
//        int[] expected = new int[30000];  // 10000 lists with 3 elements each
//        for (int i = 0; i < 30000; i++) {
//            expected[i] = i;
//        }
//        assertArrayEquals(expected, linkedListToArray(result));
//    }

    // Test 9: All lists are identical
    @Test
    public void testIdenticalLists() {
        ListNode[] lists = new ListNode[]{
                createLinkedList(new int[]{1, 2, 3}),
                createLinkedList(new int[]{1, 2, 3}),
                createLinkedList(new int[]{1, 2, 3})
        };
        ListNode result = solution.mergeKLists(lists);
        int[] expected = new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3};
        assertArrayEquals(expected, linkedListToArray(result));
    }

    // Test 10: Lists with some common elements and some distinct ones
    @Test
    public void testCommonAndDistinctElements() {
        ListNode[] lists = new ListNode[]{
                createLinkedList(new int[]{1, 3, 5}),
                createLinkedList(new int[]{2, 3, 4}),
                createLinkedList(new int[]{0, 6, 7})
        };
        ListNode result = solution.mergeKLists(lists);
        int[] expected = new int[]{0, 1, 2, 3, 3, 4, 5, 6, 7};
        assertArrayEquals(expected, linkedListToArray(result));
    }
}
