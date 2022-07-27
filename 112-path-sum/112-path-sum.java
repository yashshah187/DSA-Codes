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
    public boolean bfs(TreeNode root, int targetSum)
    {
          if(root==null) return false;
        
        
          if(root.left==null && root.right==null && targetSum-root.val==0) return true;
        
        return bfs(root.left,targetSum-root.val) || bfs(root.right,targetSum-root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(bfs(root,targetSum)) return true;
        else return false;
       
        
    }
}