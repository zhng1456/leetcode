/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy, p = head;
        while (p != null) {
            if (p.val == val) {
                pre.next = p.next;
                break;
            }
            pre = p;
            p = p.next;
        }
        return dummy.next;
    }
}