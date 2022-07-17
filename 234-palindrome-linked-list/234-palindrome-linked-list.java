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
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null)return head;
        
        ListNode rev = reverse(head.next);
        
        head.next.next = head;
        head.next = null;
        
        return rev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)return true;
        
        ListNode temp = head;
        
        int n=0;
        // ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            n++;
        }
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode head1 = head;
        ListNode head2 = (n % 2 == 0) ? reverse(slow.next) : reverse(slow);
        
        slow.next = null;
        // System.out.print(slow.val);
    
        while(head1 != null && head2 != null){
                // System.out.print(head1.val + " " + head2.val);
            if(head1.val != head2.val)return false;
            head1 = head1.next;
            head2 = head2.next;
        }
        
        return true;
        }
}