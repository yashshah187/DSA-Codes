class Solution {
    public int maxProfit(int[] prices) {
        int low=prices[0],profit=0,ans=0;
        for(int i=1;i<prices.length;i++)
        {
            if(low<prices[i])
            {
                profit=prices[i]-low;
                ans=Math.max(ans,profit);
            }
            else
                low=prices[i];
        }
        ans=Math.max(ans,profit);
        
        return ans;
    }
}