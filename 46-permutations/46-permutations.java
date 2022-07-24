class Solution {
    public void fun(int[] nums,List<List<Integer>> ans, List<Integer> ds,boolean[] freq)
    {
        if(ds.size()==nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(freq[i]==false)
            {
                freq[i]=true;
                ds.add(nums[i]);
                fun(nums,ans,ds,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        fun(nums,ans,new ArrayList<>(),new boolean[nums.length]);
        return ans;
    }
}