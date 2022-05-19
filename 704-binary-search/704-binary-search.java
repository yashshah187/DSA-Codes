class Solution {
    public int search(int[] nums, int target) {
    return binary(nums,0,nums.length-1,target);
    }
    
    public int binary(int[] nums,int l,int r,int target)
    {
        int mid=(l+r)/2;
        if(nums[mid]<target)
        {
            if(l<r)
            return binary(nums,mid+1,r,target);
            else return -1;
        }
        else if(nums[mid]>target)
        {
            if(l<r)
            return binary(nums,l,mid-1,target);
            else return -1;
        }
        else
        {
            return mid;
        }
    }
}