class Solution {
    public int climbStairs(int n) {
        if(n==1)    return 1;
        int[] target = new int[n+1];
        target[1] = 1;
        target[2] = 2;

        for(int i=3; i<n+1; i++){
            target[i] = target[i-1] + target[i-2];
        }
        return target[n];
    }
}