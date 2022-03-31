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
    public ListNode rotateRight(ListNode head, int k) {
        List<Integer> list=new ArrayList<>();
        while(head!=null)
        {
            list.add(head.val);
            head=head.next;
        }
        Collections.rotate(list,k);
        ListNode target=new ListNode();
        ListNode curr=target;
        int i=0;
        while(i<list.size())
        {

            ListNode temp=new ListNode(list.get(i++));
            curr.next=temp;
            curr=temp;
        }
        
        return target.next;
    }
}