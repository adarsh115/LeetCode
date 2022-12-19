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
        if(head == null || head.next == null)return true;
        
        //find length of list
        int i=0;
        ListNode temp = head;
        
        while(temp != null){
            i++; temp = temp.next;
        }
        
        //find mid
        
        ListNode slow = head, fast = head.next;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode head2 = (i%2 == 0) ? reverse(slow.next) : reverse(slow);
        
        slow.next = null;
        
        //compare both parts
        while(head2 != null && head != null){
            if(head2.val != head.val)return false;
            
            head = head.next;
            head2 = head2.next;
        }
        
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode current = head, prev = null, next = null;
        
        while(current != null){
            next = current.next;
            
            current.next = prev;
            prev = current;
            
            current = next;
        }
        
        return prev;
    }
}