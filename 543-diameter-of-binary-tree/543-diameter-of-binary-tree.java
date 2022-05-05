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
    public int fun(TreeNode root,int[] ans)
    {
        if(root==null) return 0;
        
        int l=fun(root.left,ans);
        int r=fun(root.right,ans);
        
        ans[0]=Math.max(ans[0],l+r);
        
        return 1+Math.max(l,r);
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int[] ans=new int[1];
        fun(root,ans);
        return ans[0];
        
    }
}