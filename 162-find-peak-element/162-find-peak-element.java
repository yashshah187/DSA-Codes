class Solution {
    public int findPeakElement(int[] nums) {
        
       int left=0,right=nums.length-1;
        
       while(left<right)
       {
           if(left==0 || right==nums.length)
           {
               if(nums[left]>nums[left+1]) 
                   return left;
               else if(nums[right]>nums[right-1]) 
                    return right;
               else 
               {
                   left++;
                   right--;
                   continue;
               }
           }
           
            if(nums[left-1]<nums[left] && nums[left]>nums[left+1]) return left;
            if(nums[right-1]<nums[right] && nums[right]>nums[right+1]) return right;
           
           left++;
           right--;
       }
        
        return nums.length/2;
     }
}