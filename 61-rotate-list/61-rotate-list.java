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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)return head;
        
        int n = 1;
        ListNode start = head;
        while(start.next != null){
            n++;
            start = start.next;
        }
        System.out.print(n);
        k = k % n;
        
        k = n - k;
        
        
        start.next  = head;
        while(k > 0){
            start = start.next;
            k--;
        }
        head = start.next;
        start.next = null;
        
        return head;
    }
}