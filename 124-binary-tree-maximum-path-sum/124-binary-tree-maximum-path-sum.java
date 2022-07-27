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
    int ans=Integer.MIN_VALUE;
    
    public int dfs(TreeNode root)
    {
        
        
        if(root==null) return 0;
        int leftSum=Math.max(0,dfs(root.left));
        int rightSum=Math.max(0,dfs(root.right));
        
        ans=Math.max(ans,root.val + leftSum + rightSum);
        
        return root.val+Math.max(leftSum,rightSum);
        
        
    }
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        else
        {
            dfs(root);
            return ans;
        }
        
    }
}