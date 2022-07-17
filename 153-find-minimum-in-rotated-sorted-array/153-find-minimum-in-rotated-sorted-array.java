class Solution {
    public int findMin(int[] nums) {
        
        if(nums[0]>nums[nums.length-1])
        {
            for(int i=nums.length-1;i>=1;i--)
            {
                if(nums[i-1]>nums[i]) return nums[i];
            }
        }
        else
        {
            return nums[0];
        }
        
        return -1;
    }
}