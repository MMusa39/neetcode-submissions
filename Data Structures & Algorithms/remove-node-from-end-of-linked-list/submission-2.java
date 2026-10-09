/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode traverse = head;
        for(int i = 0; i < n; i++) {
            traverse = traverse.next;
        }
        ListNode dummy = new ListNode(0, head);
        ListNode beforeRemove = dummy;
        while(traverse != null) {
            beforeRemove = beforeRemove.next;
            traverse = traverse.next;
        }
        beforeRemove.next = beforeRemove.next.next;
        return dummy.next;
    }
}
