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
        if(head == null || head.next == null)return null;
        
        ListNode temp = head;
        
        while(n-- > 0){
            temp = temp.next;
        }
        
        if(temp == null)return head.next;
        
        ListNode remove = head;
        
        while(temp.next != null){
            temp = temp.next;
            remove = remove.next;
        }
        
        remove.next = remove.next.next;
        
        return head;
    }
}