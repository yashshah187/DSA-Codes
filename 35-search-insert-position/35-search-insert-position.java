class Solution {
    public int binary(int[] nums,int left,int right,int target)
    {
        if(nums[left]>target) return left;
        if(nums[right]<target) return right+1;
        
        int mid=left+(right-left)/2;
        
        if(left<right && nums[mid]<target)
        {
            return binary(nums,mid+1,right,target);
        }
        else if(left<right && nums[mid]>target)
        {
            return binary(nums,left,mid-1,target);
        }
        else
        {
            return mid;
        }
        
    }
    public int searchInsert(int[] nums, int target) {
        return binary(nums,0,nums.length-1,target); 
    }
}

// 1 3 4 6