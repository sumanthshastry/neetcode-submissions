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

        if (head == null) {
            return null;
        }

        int len = 0;
        ListNode temp = head;
        while(temp != null) {
            len++;
            temp = temp.next;
        }

        if (len == n) {
            return head.next;
        }

        if (n > len) {
            return head;
        }

        ListNode cur = head;
        temp = head;

        while ((len - n - 1) >= 0) {
            temp = cur;
            cur = cur.next;
            --len;
        }

        System.out.println(temp.val);
        System.out.println(cur.val);

        temp.next = cur.next;

        return head;
    }
}
