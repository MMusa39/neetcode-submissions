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
        int len = 0;
        ListNode traverse = head;
        while(traverse != null) {
            len++;
            traverse = traverse.next;
        }
        int posToRemove = len - n;
        if(posToRemove == 0) {
            return head.next;
        }
        traverse = head;
        int pos = 0;
        while(pos < posToRemove - 1) {
            traverse = traverse.next;
            pos++;
        }
        traverse.next = traverse.next.next;
        return head;
    }
}
