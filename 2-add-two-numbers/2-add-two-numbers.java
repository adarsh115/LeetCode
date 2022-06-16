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
        ListNode pointer1 = l1;
        ListNode pointer2 = l2;
        
        ListNode dummy = new ListNode(100);
        
        ListNode temp = dummy;
        
        int sum = 0;
        int rem = 0;
        int val = 0;
        
        while(pointer1 != null && pointer2 != null){
            sum = pointer1.val + pointer2.val + rem;
            val = sum % 10;
            rem = sum / 10;
            
            ListNode newnode = new ListNode(val);
            temp.next = newnode;
            temp = temp.next;
            
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        
        while(pointer1 != null){
            sum = pointer1.val + rem;
            val = sum % 10;
            rem = sum / 10;
            
            ListNode newnode = new ListNode(val);
            temp.next = newnode;
            temp = temp.next;
            
            pointer1 = pointer1.next;
        }
        while(pointer2 != null){
            sum = pointer2.val + rem;
            val = sum % 10;
            rem = sum / 10;
            
            ListNode newnode = new ListNode(val);
            temp.next = newnode;
            temp = temp.next;
         
            pointer2 = pointer2.next;
        }
        if(rem != 0){
            ListNode newnode = new ListNode(rem);
            temp.next = newnode;
            temp = temp.next;
        }
        
        return dummy.next;
    }
}