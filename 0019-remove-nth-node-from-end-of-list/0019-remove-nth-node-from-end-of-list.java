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
        if(head == null){
            return null;
        }

        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        if(size == n){
            head = head.next;
            return head;
        }

        int position = size - n;
        ListNode curr = head;
        for(int i = 1; i < position; i++){
            curr = curr.next;
            
        }

        curr.next = curr.next.next;
        return head;
    }
}