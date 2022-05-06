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
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> q = new PriorityQueue<ListNode>((a,b)->{
            return a.val-b.val; 
            //min priority(default behaviour), for max priority we will do( b.val - a.val)
        });
        if(lists == null)return null;
        
        for(ListNode temp : lists){
            if(temp != null)q.add(temp);
        }

        ListNode head = null;
        ListNode tail = null;
        while(q.size() > 0){
            ListNode top = q.remove();
            
            if(top.next != null)q.add(top.next);
            
            if(head == null){
                head = top;
                tail = top;
            }
            else{
                tail.next = top;
                tail = top;
            }
        }
        
        return head;
    }
}