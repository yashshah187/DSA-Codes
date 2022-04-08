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
    
    public boolean fun(TreeNode Left,TreeNode Right)
    {
        if (Left == null || Right == null)
            return Left == Right;
        if (Left.val != Right.val)
            return false;
        
        return fun(Left.left,Right.right) && fun(Left.right,Right.left);
    }
    
    public boolean isSymmetric(TreeNode root) {
        return root==null || fun(root.left,root.right);
    }
}