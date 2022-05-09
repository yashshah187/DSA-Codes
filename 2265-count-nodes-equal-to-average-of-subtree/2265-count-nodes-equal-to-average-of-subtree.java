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
  int res=0;
    public int[] avg(TreeNode node)
    {
        if(node==null) return new int[]{0,0};
        
        int sum=node.val,count=1;
        
        if(node.left!=null)
        {
            int[] Left=avg(node.left);
              sum+=Left[0];
              count+=Left[1];
        }
        if(node.right!=null)
        {
             int[] Right=avg(node.right);
              sum+=Right[0];
              count+=Right[1];
        }
      
       
        if(sum/count==node.val)
        res++;
        
        return new int[]{sum,count};
        
    }
    public int averageOfSubtree(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
      avg(root);
        return res;
       
        
    }
}