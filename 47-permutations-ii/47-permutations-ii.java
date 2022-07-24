class Solution {
    public void fun(int[] nums,List<List<Integer>> ans,int index)
    {
        if(index==nums.length)
        {
            List<Integer> t=new ArrayList<>();
            for(int x:nums)
            {
                t.add(x);
            }
            
            if(!ans.contains(t))
            ans.add(new ArrayList<>(t));
            
            return;
        }
        
        for(int i=index;i<nums.length;i++)
        {
                swap(i,index,nums);
                fun(nums,ans,index+1);
                swap(i,index,nums);
        }
    }
    public void swap(int i,int index,int[] nums)
    {
        int temp=nums[i];
        nums[i]=nums[index];
        nums[index]=temp;
    }
    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> ans=new ArrayList<>();
        fun(nums,ans,0);
        return ans;
       
    }
}