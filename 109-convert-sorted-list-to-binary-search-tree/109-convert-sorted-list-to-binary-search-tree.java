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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public TreeNode fun(List<Integer> list,int start, int end)
    {

        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(list.get(mid));

        node.left = fun(list, start, mid - 1);
        node.right = fun(list, mid + 1, end);
         
        return node;
    
    }
    
    
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list=new ArrayList<>();
        
        while(head!=null)
        {
            list.add(head.val);
            head=head.next;
        }
        
        TreeNode root=fun(list,0,list.size()-1);
        
        return root;

    }
}