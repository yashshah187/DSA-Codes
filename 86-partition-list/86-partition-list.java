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
    public ListNode partition(ListNode head, int x) {
        
        ListNode less=new ListNode(), more=new ListNode();
        ListNode templ=less,tempm=more;
        
        while(head!=null)
        {
            if(head.val<x)
            {
                ListNode temp=new ListNode(head.val);
                templ.next=temp;
                templ=temp;
            }
            else
            {
                ListNode temp=new ListNode(head.val);
                tempm.next=temp;
                tempm=temp;                
            }
            
            head=head.next;
        }
        
        templ.next=more.next;     
        return less.next;
    }
}