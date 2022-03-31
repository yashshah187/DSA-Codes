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
    public ListNode deleteDuplicates(ListNode head) {
        List<Integer> list=new ArrayList<>();
        while(head!=null)
        {
            
            if(!list.contains(head.val))
            list.add(head.val);
            
            head=head.next;
        }
        ListNode node=new ListNode();
        ListNode curr=node;
        int i=0;
        while(i<list.size())
        {
             ListNode temp=new ListNode(list.get(i));
            curr.next=temp;
            curr=temp;
            i++;
        }
        
        return node.next;
    }
}