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
    public void inOrder(TreeNode root,List<Integer> list)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inOrder(root,list);
        TreeNode head=new TreeNode(list.get(0));
        TreeNode curr=head;
        for(int i=1;i<list.size();i++)
        {
            TreeNode temp=new TreeNode(list.get(i));
            curr.right=temp;
            curr=temp;
        }
        
        return head;
    }
}