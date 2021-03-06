/**
 * Merge Two Sorted Lists
 *
 * @author Ankita Oza
 * @version 1.0
 * @see https://leetcode.com/problems/merge-two-sorted-lists/
 * @see https://www.youtube.com/watch?v=j_UNYW6Ap0k
 * @since Nov 16, 2021

 */

import java.util.*;


class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


public class Test {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode result = null;

        if (l1.val <= l2.val) {
            result = l1;
            result.next = mergeTwoLists(l1.next, l2);

        } else {
            result = l2;
            result.next = mergeTwoLists(l1, l2.next);
        }
        return result;

    }

    public static void main(String[] args) {


        long start = System.currentTimeMillis();

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode mergedList = mergeTwoLists(l1, l2);

        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
        System.out.println();

        long time = System.currentTimeMillis() - start;
        System.out.println("Execution time in milliseconds: " + time + "ms");
    }
}
