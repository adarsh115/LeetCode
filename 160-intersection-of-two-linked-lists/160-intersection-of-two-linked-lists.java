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
    public ListNode findIntersection(ListNode headA, ListNode headB, int diff) {
        while(diff > 0){
            headA = headA.next;
            diff--;
        }
        
        while (headA != null && headB!= null) {
			if (headA == headB) {
				return headA;
			}
			headA = headA.next;
			headB = headB.next;
		}
		return null;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // if(headA.next == null && headB.next == null)return null;
        
        int lenA = 0;
        ListNode temp = headA;
        
        while(temp != null){
            lenA++;
            temp = temp.next;
        }
        
        int lenB = 0;
        temp = headB;
        while(temp != null){
            lenB++;
            temp = temp.next;
        }
        System.out.print(lenA + " " + lenB);
        // if(lenA <= 1 || lenB <= 1)return null;
        
        if(lenA > lenB){
            return findIntersection(headA, headB, lenA - lenB);
        }
        else{
            return findIntersection(headB, headA, lenB - lenA);
        }
    }
}