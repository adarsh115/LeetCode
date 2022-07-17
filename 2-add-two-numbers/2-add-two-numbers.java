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
        
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        
        int rem = 0;
        int sum = 0;
        
        while(l1 != null && l2 != null){
            sum = l1.val + l2.val + rem;
            rem = sum/10;
            ListNode newnode = new ListNode(sum % 10);
            temp.next = newnode;
            temp = temp.next;
            
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while(l1 != null){
            sum = l1.val + rem;
            rem = sum/10;
            ListNode newnode = new ListNode(sum % 10); 
            temp.next = newnode;
            temp = temp.next;
            
            l1 = l1.next;
        }
        while(l2 != null){
            sum = l2.val + rem;
            rem = sum/10;
            ListNode newnode = new ListNode(sum % 10); 
            temp.next = newnode;
            temp = temp.next;
            
            l2 = l2.next;
        }
        
        if(rem != 0){
            ListNode newnode = new ListNode(rem); 
            temp.next = newnode;
        }
        
        
        return dummy.next;
    }
}