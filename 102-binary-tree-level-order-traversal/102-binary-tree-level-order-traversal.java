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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null) return list;
        
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
     
        while(!q.isEmpty())
        {
            List<Integer> curr=new ArrayList<>();
            int size=q.size();
            
            for(int i=0;i<size;i++)
            {
            TreeNode temp=q.poll();
            curr.add(temp.val);
            if(temp.left!=null)
            {
                q.offer(temp.left);
                
            }
            if(temp.right!=null)
            {
                q.offer(temp.right);
                
            }
            }
            
            list.add(curr);
            
        }
        
        return list;
    }
    
    
}