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
        if(head == null || head.next == null) return null;
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode prev = dummy;
        
        ListNode start = head;
        
        int i = 0;
        while(i<n-1){
            start = start.next;
            i++;
        }
        
        ListNode end = head;
        while(start.next != null){
            end = end.next;
            prev = prev.next;
            start = start.next;
        }
        
        prev.next = end.next;
        
        return dummy.next;
    }
}