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
    public ListNode reverse(ListNode head)
    {
        ListNode next=null,prev=null,curr=head;
        
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        
        
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if(k==1) return head;
        
        int count=k;
        
        
        ListNode f=new ListNode();
        ListNode tf=f;
        
        while(head!=null)
        {
        ListNode ans=new ListNode();
        ListNode ta=ans;
            
            while(head!=null && count>0)
            {
                ListNode temp=new ListNode(head.val);
                ta.next=temp;
                ta=temp;
                head=head.next;
                count--;
            }
            
            if(count==0)
            {
            ListNode temps=reverse(ans.next);
            tf.next=temps;
            tf=temps;
            
            while(tf.next!=null)
            {
                tf=tf.next;
            }
                
            }
            else
            {
                tf.next=ans.next;
            }
            count=k;
        }
        
        return f.next;
    }
}