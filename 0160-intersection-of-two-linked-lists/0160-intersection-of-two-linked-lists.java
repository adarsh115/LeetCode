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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)return null;
        if(headA == headB)return headA;
        
        
        int lenA = 0, lenB = 0;
        ListNode temp = headA;
        while(temp != null){
            temp = temp.next;
            lenA++;
        }
        
        temp = headB;
        while(temp != null){
            temp = temp.next;
            lenB++;
        }
        
        System.out.println(lenA + " " + lenB);
        return lenA >= lenB ? intersection(headA, headB, lenA-lenB) : intersection(headB, headA, lenB-lenA);
    }
    
    public ListNode intersection(ListNode A, ListNode B, int diff){
        ListNode tempA = A, tempB = B;
        while(diff-- > 0){
            tempA = tempA.next;  
        }
        
        while(tempA != null && tempB != null){
            
            if(tempA == tempB)break;
            
            tempA = tempA.next;
            tempB = tempB.next;
        }
        
        if(tempA == null || tempB == null)return null;
        
        return tempA;
    }
}