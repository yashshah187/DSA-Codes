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
        ListNode a=headA;
        ListNode b=headB;
        
        int counta=0,countb=0;
        while(a!=null)
        {
            counta++;
            a=a.next;
        }
        
         while(b!=null)
        {
            countb++;
            b=b.next;
        }
        
        int d=Math.abs(counta-countb);
        
        if(counta>countb)
        {
            while(d>0)
            {
                headA=headA.next;
                d--;
            }
        }
        else
        {
            while(d>0)
            {
                headB=headB.next;
                d--;
            }
        }
            
        while(headA!=null)
        {
            
            if(headA==headB) return headA;
            headA=headA.next;
            headB=headB.next;
        }
        
        return null;
    }
}