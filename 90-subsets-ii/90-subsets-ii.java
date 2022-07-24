class Solution {
    
    public void fun(int index,int[] nums, List<List<Integer>> ans, List<Integer> ds)
    {
        if(index==nums.length)
        {
            if(!ans.contains(ds))
            ans.add(new ArrayList<>(ds));
        }
        else
        {
            ds.add(nums[index]);
            fun(index+1,nums,ans,ds);
            ds.remove(ds.size()-1);
            fun(index+1,nums,ans,ds);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        fun(0,nums,ans,new ArrayList<>());
        return ans;
    }
}