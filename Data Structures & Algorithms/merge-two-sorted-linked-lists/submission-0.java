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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = null;
        if(list1 == null && list2 == null) {
            return merged;
        } else if(list1 == null) {
            merged = new ListNode(list2.val); 
            list2 = list2.next;
        } else if (list2 == null) {
            merged = new ListNode(list1.val);
            list1 = list1.next;
        } else if (list1.val < list2.val) {
            merged = new ListNode(list1.val);
            list1 = list1.next;
        } else {
            merged = new ListNode(list2.val); 
            list2 = list2.next;
        }
        
        ListNode helper = merged;
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                helper.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                helper.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            helper = helper.next;
        }

        while(list1 != null) {
            helper.next = new ListNode(list1.val);
            list1 = list1.next;
            helper = helper.next;
        }

        while(list2 != null) {
            helper.next = new ListNode(list2.val);
            list2 = list2.next;
            helper = helper.next;
        }
        return merged;
    }
}