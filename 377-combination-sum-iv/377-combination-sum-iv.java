class Solution {
    public int fun(int[] nums,int target,int n,int[] dp)
    {
        if(target==0) return 1;
        if(target<0) return 0;
        
        if(dp[target]!=-1) 
        {
            return dp[target];
        }
        
        int pair=0;
        for(int i=0;i<n;i++)
        {
            pair+=fun(nums,target-nums[i],n,dp);
        }
        
        return dp[target]=pair;
        
    }
    public int combinationSum4(int[] nums, int target) {
        int n=nums.length;
        int[] dp=new int[target+1];
        Arrays.fill(dp,-1);
        return fun(nums,target,n,dp);
    }
}