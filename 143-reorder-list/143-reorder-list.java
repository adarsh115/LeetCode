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
        ListNode prev = null;
        ListNode currentNode = head;
        
        while(currentNode != null){
            ListNode nextNode = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = nextNode;
        }
        
        return prev;
    }
    public void merge(ListNode head, ListNode head2){
        while (head != null && head2 != null) {
            ListNode tmp1 = head.next;
            ListNode tmp2 = head2.next;
            
            head.next = head2;
            head2.next = tmp1;
            
            head = tmp1;
            head2 = tmp2;
        }
    }
    public void reorderList(ListNode head) {
        if(head == null || head.next == null )return;
        
//         head list one
        ListNode headone = head;
//         head list two
        ListNode slow = head;

        ListNode fast = head.next;
        
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
//         head of reversed ll
        ListNode headtwo = reverse(slow.next);
        slow.next = null;

        merge(headone, headtwo);
    }
}