/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode dfs(TreeNode root,TreeNode p,TreeNode q,int[] visited)
    {
        if(root==null || root==p || root==q) return root;
        
        TreeNode L = dfs(root.left,p,q,visited);
        TreeNode R = dfs(root.right,p,q,visited);
 
        if(L!=null && R!=null) return root;
        
        return L!=null?L:R;
        
    }
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return root;
        
        if(root==p || root==q) return root;
        
        int[] visited=new int[]{-1,-1};
            
        return dfs(root,p,q,visited);
            
 
    }
}