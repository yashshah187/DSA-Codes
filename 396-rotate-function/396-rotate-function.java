class Solution {
    public int maxRotateFunction(int[] nums) {
       int n = nums.length;
        int sum = 0, init = 0;
        
        for(int i = 0; i < n; i++)
        {
            sum += nums[i];
            init += (nums[i] * i);
        }
        
        System.out.println(sum+" "+ init);
        int ans = init;
        
        for(int k = 1; k < n; k++)
        {
            int newValue = init + (nums[k - 1] * (n - 1)) - (sum - nums[k - 1]);
            init = newValue;
            ans = Math.max(newValue, ans);
        }
        
        return ans;
    }
}