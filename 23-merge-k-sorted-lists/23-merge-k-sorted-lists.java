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
        Queue<ListNode> q = new PriorityQueue<>((a,b)->{return a.val - b.val;});
        
        if(lists.length == 0)return null;
        
        for(ListNode list: lists){
            if(list != null)q.add(list);
        }
        
        ListNode head = null;
        ListNode tail = null;
        
        while(q.size() > 0){
            ListNode top = q.remove();
            if(top.next != null)q.add(top.next);
            
            if(head == null && tail == null){
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