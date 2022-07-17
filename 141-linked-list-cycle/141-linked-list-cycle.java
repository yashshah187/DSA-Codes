/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Boolean> map=new HashMap<>();
        
        while(true)
        {
            if(head==null) return false;
            
            if(map.containsKey(head)) return true;
            
            map.put(head,true);
            head=head.next;
        }
         
    }
}