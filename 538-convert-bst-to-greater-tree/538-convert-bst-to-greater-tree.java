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
    public int getSum(TreeNode root , int sum)
    {
        if(root==null) return sum;
        
        root.val+=getSum(root.right,sum);
        return getSum(root.left,root.val);
        
    }
    public TreeNode convertBST(TreeNode root) {
        
        getSum(root,0);
        return root;
    }
}