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
    public ListNode swapPairs(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        
        ListNode prev=head,curr=head.next;
        
        while(curr!=null)
        {
            int temp=prev.val;
            prev.val=curr.val;
            curr.val=temp;
            
            if(prev.next.next!=null)
            prev=prev.next.next;
            else break;
            
            if(curr.next.next!=null)
            curr=curr.next.next;
            else break;
        }
        
        return head;
        
    }
}