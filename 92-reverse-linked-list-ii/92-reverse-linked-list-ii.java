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
    public ListNode reverseN(ListNode head)
    {
        if(head==null || head.next==null) return head;
        
        ListNode temp=reverseN(head.next);
        head.next.next=head;
        head.next=null;
        
        return temp;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode mid=new ListNode(),start=new ListNode(), end=new ListNode();
        ListNode tempm=mid,temps=start,tempe=end;
        int count=1;
        
        while(head!=null)
        {
            if(count<left)
            {
                ListNode temp=new ListNode(head.val);
                temps.next=temp;
                temps=temp;
                count++;
            }
            else if(count>=left && count<=right)
            {
                ListNode temp=new ListNode(head.val);
                tempm.next=temp;
                tempm=temp;
                count++;
                
                if(count==right+1)
                {
                   mid=reverseN(mid.next);
                   temps.next=mid;
                }
            }
            else
            {
                ListNode temp=new ListNode(head.val);
                tempe.next=temp;
                tempe=temp;
                count++;
            }
            
            head=head.next;
            
        }
        
        while(temps.next!=null)
        {
            temps=temps.next;
        }
        
        temps.next=end.next;
        
        return start.next;
        
    }
}