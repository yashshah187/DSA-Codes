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
      List<Integer> list = new ArrayList<>();
    int p=0;
    public void recoverTree(TreeNode root) {
        Inorder(root);
        Collections.sort(list);
        Insert(root);
    }
    public void Inorder(TreeNode ans){
        if(ans==null) return;
        Inorder(ans.left);
        list.add(ans.val);
        Inorder(ans.right);
    }
    public void Insert(TreeNode root){
        if(root==null) return;
        Insert(root.left);
        root.val=list.get(p);
        p++;
        Insert(root.right);
    }
}