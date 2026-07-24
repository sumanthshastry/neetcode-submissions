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

        if (list1 == null && list2 == null) {
            return null;
        }

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode list1Cur = list1,  list2Cur = list2, result = null;

        if (list1Cur.val < list2Cur.val) {
            result = list1Cur;
            list1Cur = list1Cur.next;
        } else {
            result = list2Cur;
            list2Cur = list2Cur.next;
        }

        ListNode resultCur = result;

        while (list1Cur != null && list2Cur != null) {
            if (list1Cur.val < list2Cur.val) {
                result.next = list1Cur;
                list1Cur = list1Cur.next;
            } else {
                result.next = list2Cur;
                list2Cur = list2Cur.next;
            }

            result = result.next;
        }

        System.out.println("Shaa");

        if (list1Cur != null) {
            result.next = list1Cur;
        }

        if (list2Cur != null) {
            result.next = list2Cur;
        }
        
        return resultCur;
    }
}