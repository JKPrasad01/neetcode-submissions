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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        String s1 = "";
        String s2 = "";

        while(l1 != null){
            s1 = l1.val+s1;
            l1 = l1.next;
        }

         while(l2 != null){
            s2 = l2.val+s2;
            l2 = l2.next;
        }

       int sum =Integer.valueOf(s1)+Integer.valueOf(s2);;

        if (sum == 0) return new ListNode(0);

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (sum > 0) {
            int rem = (int)(sum % 10);
            current.next = new ListNode(rem);
            current = current.next;
            sum = sum / 10;
        }

        return dummy.next;
    }
}
