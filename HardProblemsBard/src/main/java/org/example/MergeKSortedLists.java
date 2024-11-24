package org.example;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class MergeKSortedLists {
    public ListNode merge(ListNode l1, ListNode l2) {
        if (l2 == null) return l1;
        if (l1 == null) return l2;
        if (l1.val <= l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        }
        l2.next = merge(l1, l2.next);
        return l2;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if (len == 0) return null;

        ListNode mergedList = lists[0];
        for (int i = 1; i < len; ++i) {
            mergedList = merge(mergedList, lists[i]);
            lists[i] = mergedList;
        }

        return mergedList;
    }
}
