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
    public boolean hasCycle(ListNode head) {
        
        if (head == null || head.next == null) {
            return false;
        }

        ListNode temp1 = head, temp2 = head.next;

        while (temp1 != null || temp2 != null) {
            if (temp1 == temp2) {
                return true;
            }
            temp1 = temp1.next;
           

            if (temp2 == null) {
                return false;
            }
            temp2 = temp2.next;

            if (temp2 == null) {
                return false;
            }
            temp2 = temp2.next;
        }

        return false;
    }
}
