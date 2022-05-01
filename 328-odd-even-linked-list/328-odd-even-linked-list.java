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
    public ListNode oddEvenList(ListNode head) {
      ListNode nodeL=new ListNode();
      ListNode nodeR=new ListNode();
      ListNode curr=head, curr1=nodeL,curr2=nodeR;
      
        while(curr!=null)
        {
            ListNode temp1=new ListNode(curr.val);
            curr1.next=temp1;
            curr1=temp1;
            curr=curr.next;
            
            if(curr==null) break;
            ListNode temp2=new ListNode(curr.val);
            curr2.next=temp2;
            curr2=temp2;
            curr=curr.next;
               
        }
        
        if(nodeL.next==null) return nodeR.next;
        if(nodeR.next==null) return nodeL.next;
        
        ListNode p=nodeL.next;
        while(p.next!=null)
        {
            p=p.next;
        }
        p.next=nodeR.next;
        return nodeL.next;
        
    }
}