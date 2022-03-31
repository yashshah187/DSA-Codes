class Solution {
    public int removeDuplicates(int[] nums) {
        int curr=nums[0],count=1,index=1;
        int[] arr= new int[nums.length];
	      arr[0] = nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] ==curr)
        {
            if(count <2)
            {
             count++;
             arr[index++]= curr;
            }
        }
        else
        {
            count =1;
            curr = nums[i];
            arr[index++]= curr;
            
        } 
        }
        
        for(int i=0; i<nums.length; i++)
    nums[i] = arr[i];
        
        return index;
    }
}