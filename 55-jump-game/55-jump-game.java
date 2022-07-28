class Solution {
    
    public boolean fun(int[] nums,int index,int[] dp)
    {
        
       if(index>=nums.length-1) return true;
       
        if(nums[index]==0) 
        {
            dp[index]=0;
            return false;
        }
        
        if(dp[index]!=-1) return dp[index]==1;

        
        for(int i=1;i<=nums[index];i++)
        {
            if(fun(nums,index+i,dp))
            {
                dp[index]=1;
                return true;
            }
                
        }
        
        dp[index]=0;
        return false;
        
    }
    
    public boolean canJump(int[] nums) {
    
        int[] ds=new int[nums.length];
        Arrays.fill(ds,-1);
        return fun(nums,0,ds);
         
    }
}