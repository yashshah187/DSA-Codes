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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list=new ArrayList<>();
        for(ListNode s:lists)
        {
            while(s!=null)
            {
                list.add(s.val);
                s=s.next;
            }
        }
        Collections.sort(list);
        ListNode head=new ListNode();
        ListNode curr=head;
        int i=0;
        while(i<list.size())
        {
            ListNode temp=new ListNode(list.get(i));
            curr.next=temp;
            curr=temp;
            i++;
        }
        
        return head.next;
    }
}