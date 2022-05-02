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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> list=new ArrayList<>();
        if(root==null) return list;
        
        Queue<TreeNode> stack=new LinkedList<>();
        stack.add(root);
        boolean LeftToRight=true;
       
        while(!stack.isEmpty())
        {
            int n=stack.size();
            List<Integer> list1=new ArrayList<>();
            
        for(int j=0;j<n;j++)
        {
            TreeNode temp=stack.poll();
         
            if(temp.left!=null)
            {
                stack.add(temp.left);
            }
            
            if(temp.right!=null)
            {
                stack.add(temp.right);
            }
            
            list1.add(temp.val);
        } 
            
            if(LeftToRight==false) 
            {
                Collections.reverse(list1);
            }
            
            list.add(list1);
            
            LeftToRight=!(LeftToRight);
            
        }
        
        return list;
    }
}