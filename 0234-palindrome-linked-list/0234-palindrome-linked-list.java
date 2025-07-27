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
    public boolean isPalindrome(ListNode head) {
       if(head == null && head.next == null){
            return false;
        }
        ListNode midnode = midNode(head);
        ListNode prev = null;
        ListNode curr = midnode;
        ListNode nExt;
        while(curr != null){
            nExt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nExt;
        }

        ListNode right = prev;
        ListNode left = head;
        while(right != null){
            if(left.val != right.val)return false;
            left = left.next;
            right = right.next;
        }
        return true;




    }
    public ListNode midNode(ListNode head){
         if(head == null){
            return null;
         }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}