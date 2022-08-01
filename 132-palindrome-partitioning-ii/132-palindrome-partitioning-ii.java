class Solution {
    public int fun(String s,int index,int[] dp)
    {
        if(index>=s.length())
            return 0;
        
        if(dp[index]!=0) return dp[index];
        
        int ans=Integer.MAX_VALUE;
    
        for(int i=index;i<s.length();i++)
        {
           
            if(isP(s,index,i))
            {
                int cost=1+fun(s,i+1,dp);
                ans=Math.min(ans,cost);
            }
            
        }
        
        return dp[index]=ans;
        
    }
    public boolean isP(String s,int start,int end)
    {
        
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end)) return false;
            
            start++;
            end--;
        }
        
        return true;
    }
    public int minCut(String s) {
        if(s.length()==1) return 0;
        int[] dp=new int[s.length()];
        
        return fun(s,0,dp)-1;
        
    }
}
