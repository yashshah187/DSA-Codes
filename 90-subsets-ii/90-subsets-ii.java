class Solution {
    
    public void fun(int index,int[] nums, List<List<Integer>> ans, List<Integer> ds)
    {
        ans.add(new ArrayList<>(ds));
        for(int i=index;i<nums.length;i++)
        {
            if(i!=index && nums[i]==nums[i-1]) continue;
            
            ds.add(nums[i]);
            fun(i+1,nums,ans,ds);
            ds.remove(ds.size()-1);
        }
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        fun(0,nums,ans,new ArrayList<>());
        return ans;
    }
}