/**
Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.

Hide Tags Linked List Two Pointers
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) return head;
        ListNode cur = head, target = head;
        int i = 0;
        while (cur != null) {
            if (++i > n + 1) target = target.next;
            cur = cur.next;
        }
        if (i == n) return head.next;
        if (i > n) target.next = target.next.next;
        return head;
    }
}