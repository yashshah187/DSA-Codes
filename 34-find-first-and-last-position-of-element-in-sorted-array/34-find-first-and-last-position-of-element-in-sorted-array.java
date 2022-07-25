class Solution {
    public int[] searchRange(int[] nums, int target) {

        int left=0,right=nums.length-1;
        boolean checkL=false,checkR=false;

        int[] ans=new int[]{-1,-1};

        
        while(left<nums.length && right>=0)
        {
            if(nums[left]==target && checkL==false)
            {
                ans[0]=left;    
                checkL=true;
            }
                
            
            if(nums[right]==target && checkR==false)
            {
                ans[1]=right;
                checkR=true;
            }
            
            if(checkL==true && checkR==true) break;
            
            left++;
            right--;
        }
        
        return ans;
    }
}