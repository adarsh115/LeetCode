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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1)return head;
        
        int count = 0;
        ListNode temp = head;
        
        while(temp != null){
            count++;
            temp = temp.next;
        }
        
        return solve(head, k , count);
    }
    public ListNode solve(ListNode head, int k, int count){
        if(head == null)return null;
        if(count < k)return head;
        
        ListNode next = null;
        ListNode prev = null;
        ListNode curr = head;
        
        int nodecount = 0;
        
        while(curr != null && nodecount < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            nodecount++;
        }
        count -= k;
        if(next != null)head.next = solve(next, k, count);
        
        return prev;
    }
}