class Solution {
    public int climbStairs(int n) {
//         if(n==1)    return 1;
//         int[] target = new int[n+1];
//         target[1] = 1;
//         target[2] = 2;

//         for(int i=3; i<n+1; i++){
//             target[i] = target[i-1] + target[i-2];
//         }
//         return target[n];
        
        if(n==1) return 1;
        int prev2=1,prev1=2;
        
        for(int i=3;i<=n;i++)
        {
            int curr=prev2+prev1;
            prev2=prev1;
            prev1=curr;
        }
        
        return prev1;
    }
}