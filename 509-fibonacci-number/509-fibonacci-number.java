class Solution {
    public int fib(int n) {
        int prev2=0,prev1=1;
        
        if(n==0) return 0;
        else if(n==1) return 1;
        else
        {
        for(int i=2;i<=n;i++)
        {
            int curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
           
        }
        }
        
        return prev1;
    }
}