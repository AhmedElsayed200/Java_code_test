package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MergeKSortedListsTest {

    @Test
    public void testEmptyLists() {
        ListNode[] lists = new ListNode[0];
        assertNull(new MergeKSortedLists().mergeKLists(lists));
    }

    @Test
    public void testSingleList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode[] lists = {head};
        assertListEqual(head, new MergeKSortedLists().mergeKLists(lists));
    }

    @Test
    public void testBasicMerge() {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode list3 = new ListNode(2);
        list3.next = new ListNode(6);

        ListNode[] lists = {list1, list2, list3};
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(1);
        expected.next.next = new ListNode(2);
        expected.next.next.next = new ListNode(3);
        expected.next.next.next.next = new ListNode(4);
        expected.next.next.next.next.next = new ListNode(4);
        expected.next.next.next.next.next.next = new ListNode(5);
        expected.next.next.next.next.next.next.next = new ListNode(6);

        assertListEqual(expected, new MergeKSortedLists().mergeKLists(lists));
    }

    @Test
    public void testLargeLists() {
        // Create large sorted lists with random values
        int n = 1000;
        ListNode[] lists = new ListNode[5];
        for (int i = 0; i < lists.length; ++i) {
            lists[i] = generateSortedList(n);
        }

        ListNode mergedList = new MergeKSortedLists().mergeKLists(lists);
        // Check if the merged list is actually sorted
        ListNode prev = null;
        while (mergedList != null) {
            if (prev != null && prev.val > mergedList.val) {
                fail("Merged list is not sorted.");
            }
            prev = mergedList;
            mergedList = mergedList.next;
        }
    }

    private ListNode generateSortedList(int size) {
        ListNode head = new ListNode((int) (Math.random() * 100));
        ListNode curr = head;
        for (int i = 1; i < size; ++i) {
            int val = curr.val + (int) (Math.random() * 5);
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return head;
    }

    private void assertListEqual(ListNode expected, ListNode actual) {
        ListNode currExpected = expected;
        ListNode currActual = actual;
        while (currExpected != null && currActual != null) {
            assertEquals(currExpected.val, currActual.val);
            currExpected = currExpected.next;
            currActual = currActual.next;
        }
        assertNull(currExpected);
        assertNull(currActual);
    }
}
