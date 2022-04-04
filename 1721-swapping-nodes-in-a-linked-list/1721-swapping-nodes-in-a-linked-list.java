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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        
        for(int  i = 0; i<k-1; i++){
            temp = temp.next;
        }
        
        ListNode first = temp;
        ListNode second = head;
        
        while(temp.next != null){
            second = second.next;
            temp = temp.next;
        }
        
        int tempdata = first.val;
        first.val = second.val;
        second.val = tempdata;
        
        return head;
    }
}