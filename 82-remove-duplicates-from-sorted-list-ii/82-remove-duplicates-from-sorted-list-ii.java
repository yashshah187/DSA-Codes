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
        Map<Integer,Integer> map=new TreeMap<>();
        
        while(head!=null)
        {
            if(map.containsKey(head.val))
                map.put(head.val,map.get(head.val)+1);
            else
                map.put(head.val,1);
            
            head=head.next;
        }
        
        ListNode node=new ListNode();
        ListNode curr=node;
        for(Map.Entry<Integer,Integer> val:map.entrySet())
        {
            if(val.getValue()==1)
            {

                ListNode temp=new ListNode(val.getKey());
                curr.next=temp;
                curr=temp;
                
            }
                
        }
        
        return node.next;
    }
}