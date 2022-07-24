class Solution {
    public void fun(int[] nums,boolean[] freq, List<List<Integer>> ans,List<Integer> ds)
    {
        if(ds.size()==nums.length)
        {
            if(!ans.contains(ds))
            ans.add(new ArrayList<>(ds));
            
            return;
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(freq[i]==false)
            {
                ds.add(nums[i]);
                freq[i]=true;
                fun(nums,freq,ans,ds);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        fun(nums,new boolean[nums.length],ans,new ArrayList<>());
        return ans;
       
    }
}