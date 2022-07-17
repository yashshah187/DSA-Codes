class Solution {
    public int binary(int[] nums,int l,int r,int target)
    {
        while(l<=r)
        {
        int m=l+(r-l)/2;
        
        if(nums[m]<target)
        {
            l=m+1;
        }
        else if(nums[m]>target)
        {
            r=m-1;
        }
        else return m;
        }
        
        return -1;
    }
    public int search(int[] nums, int target) {
       int ans=0;
        int i=0;
        
      while(i<nums.length-1 && nums[i]<=nums[i+1]) i++;
       ans=binary(nums,0,i,target);
        
        if(ans==-1)
        {
            ans=binary(nums,i+1,nums.length-1,target);
        }
        
        return ans;
    }
}