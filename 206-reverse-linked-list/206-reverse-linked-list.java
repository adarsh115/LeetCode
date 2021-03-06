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
    public ListNode reverseList(ListNode head) {
//         ListNode prev = null;
//         ListNode current = head;
        
//         while(current != null){
//             ListNode nextNode = current.next;
//             current.next = prev;
//             prev = current;
//             current = nextNode;
//         }
        
        return reverse(head);
    }
}