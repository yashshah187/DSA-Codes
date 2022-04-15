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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root==null) return null;
        
        if(root.val>high)
        {
            return trimBST(root.left,low,high); // As it is a bst if val of parent is greater tha high all other on right side will greater so triming it
        }
        if(root.val<low)
        {
            return trimBST(root.right,low,high);  // As it is a bst if val of parent is less tha low all other on left side will lesser so triming it
        }
     
        root.left=trimBST(root.left,low,high);
        root.right=trimBST(root.right,low,high);
        return root;
    }
}