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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)return head;
        
        ListNode odd = head, even = head.next;
        
        ListNode temp = head.next;
        
        boolean oddIndex = true;
        
        while(odd.next != null && even.next != null){
            
            if(oddIndex){
                odd.next = even.next;
                odd = odd.next;
            }
            else{
                even.next = odd.next;
                even = even.next;
            }
            
            oddIndex = !oddIndex;
        }
        
        if(odd.next == null){
            even.next = null;            
        }

        odd.next = temp;
        
        return head;
    }
}