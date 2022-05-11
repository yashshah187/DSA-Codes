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
    public boolean isCompleteTree(TreeNode root) {
    
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        TreeNode node=null;
        while(true)
        {
            TreeNode temp=q.peek();
            if(temp.left!=null)
            {
                q.offer(temp.left);
            }
            else
            {
                node=temp;
                break;
            }
            
            if(temp.right!=null)
            {
                q.offer(temp.right);
            }
            else
            {
                node=temp;
                break;
            }
            q.poll();
        }
        if(node.left==null && node.right!=null) return false;
        q.poll();
        
        while(!q.isEmpty())
        {
            TreeNode temp=q.poll();
            if(temp.left!=null || temp.right!=null)
                return false;
        }
        
        return true;
    }
}

// Queue q = new LinkedList<>();
//         q.add(root);
//         TreeNode node = null;
//         while(true) {
//             TreeNode top = q.peek();
//             if (top.left != null) {
//                 q.add(top.left);
//             }else {
//                 node = top;
//                 break;
//             }
//             if (top.right != null) {
//                 q.add(top.right);
//             }else {
//                 node = top;
//                 break;
//             }
//             q.poll();
//         }
//         if (node.left == null && node.right != null) {
//             return false;
//         }
//         q.poll();
//         while(!q.isEmpty()) {
//             TreeNode curr = q.poll();
//             if (curr.left != null || curr.right != null) {
//                 return false;
//             } 
//         }
//         return true;