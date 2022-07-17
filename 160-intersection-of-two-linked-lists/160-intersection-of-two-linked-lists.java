/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A, ListNode B, int diff){
                System.out.print(diff);
        ListNode temp1 = A;
        while(diff-- > 0){
            temp1 = temp1.next;
        }
        
        ListNode temp2 = B;
        
        while(temp1 != temp2){
            
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        return temp1;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int a=0, b=0;
        ListNode ans = null;
        
        ListNode temp = headA;
        while(temp != null){
            a++;
            temp = temp.next;
        }
        temp = headB;
        while(temp != null){
            b++;
            temp = temp.next;
        }
        
        int diff = a-b;

        if(diff > 0){
           return solve(headA, headB, a-b);
        }
        else{
            return solve(headB, headA, b-a);
        }
        
        // return ans;
    }
}