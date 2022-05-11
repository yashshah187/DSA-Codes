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
    public int sum=0;
   public int getsum(TreeNode root)
   {
       if(root==null) return 0;
       if(root.right!=null) getsum(root.right);
       root.val+=sum;
       sum=root.val;
       if(root.left!=null) getsum(root.left);
       
       return root.val;
        
   }
    public TreeNode bstToGst(TreeNode root) {
        if(root==null) return root;
        getsum(root);
        return root;
    }
}