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
        if(head == null || head.next == null) return true;

        
        int n = 0;
        ListNode temp = head;
        while(temp != null){
            n++;
            temp=temp.next;
        }
        
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        
        ListNode l1 = head;
        ListNode l2 = (n%2 == 0) ? reverse(slow.next) : reverse(slow);
        slow.next = null;
        
        while(l1 != null && l2 != null){
            if(l1.val != l2.val)return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}