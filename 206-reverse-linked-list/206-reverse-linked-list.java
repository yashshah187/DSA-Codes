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
    public ListNode reverseList(ListNode head) {
        List<Integer> list=new ArrayList<>();
        while(head!=null)
        {
            list.add(head.val);
            head=head.next;
        }
        ListNode node=new ListNode();
        ListNode curr=node;
        for(int i=list.size()-1;i>=0;i--)
        {
            ListNode temp=new ListNode(list.get(i));
            curr.next=temp;
            curr=temp;
        }
        
        return node.next;
    }
}