class Solution {

    public int fun(int[] nums, int index,int prev,int[][] dp)
    {
          if(index==nums.length) return 0;
        
          if(dp[index][prev+1]!=0) return dp[index][prev+1];
        
          int notPick=fun(nums,index+1,prev,dp);
          int pick=-1;
          
          if(prev==-1 || nums[index]>nums[prev])
          {
              pick = 1+fun(nums,index+1,index,dp);
          }
        
        return dp[index][prev+1]=Math.max(pick,notPick);
    }
    
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0) return 0;
        int[][] dp=new int[nums.length][nums.length+1];
        
        return fun(nums,0,-1,dp);
    }
}