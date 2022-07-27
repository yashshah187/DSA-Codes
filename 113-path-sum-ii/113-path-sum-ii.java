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
    public void bfs(TreeNode root, int target, List<Integer> ds, List<List<Integer>> ans)
    {
        if(root==null) return;
        
        if(root.left==null && root.right==null && target-root.val==0)
        {
            ds.add(root.val);
            ans.add(new ArrayList<>(ds));
            ds.remove(ds.size()-1);
        }
        
        ds.add(root.val);
        bfs(root.left,target-root.val,ds,ans);
        bfs(root.right,target-root.val,ds,ans);
        ds.remove(ds.size()-1);
        
        return;
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        
        bfs(root,targetSum,ds,ans);
        
        return ans;
    }
}