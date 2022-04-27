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
    public TreeNode BSTree(int[] nums,int s,int l)
    {
        if(s>l) return null;
        
        int mid=(s+l)/2;
        TreeNode tree=new TreeNode(nums[mid]);
        
        tree.left=BSTree(nums,s,mid-1);
        tree.right=BSTree(nums,mid+1,l);
        
        return tree;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
       return BSTree(nums,0,nums.length-1);
        
    }
}