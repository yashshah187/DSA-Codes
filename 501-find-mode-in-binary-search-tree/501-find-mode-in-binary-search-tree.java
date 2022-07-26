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
    public void dfs(TreeNode root,Map<Integer,Integer> map)
    {
        if(root==null) return;
        dfs(root.left,map);
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        dfs(root.right,map);
    }
    public int[] findMode(TreeNode root) {
        Map<Integer,Integer> map=new HashMap<>();
        dfs(root,map);

        List<Integer> list=new ArrayList<>();
        int index=0,max=0;
        for(int x:map.keySet())
        {
            if(max<map.get(x))
            {
                while(list.size()>0) list.remove(0);      
                list.add(x);
                
                System.out.println(x);
                max=map.get(x);
            }
            else if(max==map.get(x))
            {
                list.add(x);
            }
                
        }
        
        int[] ans=new int[list.size()];
        while(index<ans.length)
        {
            ans[index]=list.get(index);
            index++;
        }
        
        return ans;
    }
}